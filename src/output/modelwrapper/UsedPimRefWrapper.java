package stdgui.data.model.modelwrapper;


    
    


     

public class UsedPimRefWrapper {

    
    
    private UsedPimRef usedPimRef;

    public UsedPimRefWrapper(UsedPimRef usedPimRef) {
        this.usedPimRef = usedPimRef;
    }

   
    public PerInstanceMemorySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(usedPimRef.getDest())) {
            
            return usedPimRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getUsedPimRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = usedPimRef.getValue();
        java.lang.String type = usedPimRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = usedPimRef.getValue();
        java.lang.String type = usedPimRef.getDest().toString().replace("_", "-");
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