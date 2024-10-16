package stdgui.data.model.modelwrapper;


    
    


     

public class PerInstanceMemoryRefWrapper {

    
    
    private PerInstanceMemoryRef perInstanceMemoryRef;

    public PerInstanceMemoryRefWrapper(PerInstanceMemoryRef perInstanceMemoryRef) {
        this.perInstanceMemoryRef = perInstanceMemoryRef;
    }

   
    public PerInstanceMemorySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(perInstanceMemoryRef.getDest())) {
            
            return perInstanceMemoryRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPerInstanceMemoryRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = perInstanceMemoryRef.getValue();
        java.lang.String type = perInstanceMemoryRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        java.lang.String className = schemaController.convertClassName(type);
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        java.lang.String wrapperClassName = "" + className + "Wrapper";
        Class<?> wrapperClass = Class.forName(wrapperClassName);
        Constructor<?> wrapperConstructor = wrapperClass.getConstructor(queryObject.getClass());
        Object wrapperInstance = wrapperConstructor.newInstance(queryObject);
        return wrapperInstance;
    }

    
    public PerInstanceMemoryWrapper getPerInstanceMemory() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = perInstanceMemoryRef.getValue();
        java.lang.String type = perInstanceMemoryRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PerInstanceMemory){
            return new PerInstanceMemoryWrapper((PerInstanceMemory) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}