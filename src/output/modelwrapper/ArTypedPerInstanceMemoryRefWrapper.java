package stdgui.data.model.modelwrapper;


    
    


     

public class ArTypedPerInstanceMemoryRefWrapper {

    
    
    private ArTypedPerInstanceMemoryRef arTypedPerInstanceMemoryRef;

    public ArTypedPerInstanceMemoryRefWrapper(ArTypedPerInstanceMemoryRef arTypedPerInstanceMemoryRef) {
        this.arTypedPerInstanceMemoryRef = arTypedPerInstanceMemoryRef;
    }

   
    public VariableDataPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(arTypedPerInstanceMemoryRef.getDest())) {
            
            return arTypedPerInstanceMemoryRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getArTypedPerInstanceMemoryRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = arTypedPerInstanceMemoryRef.getValue();
        java.lang.String type = arTypedPerInstanceMemoryRef.getDest().toString().replace("_", "-");
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

    
    public VariableDataPrototypeWrapper getVariableDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = arTypedPerInstanceMemoryRef.getValue();
        java.lang.String type = arTypedPerInstanceMemoryRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableDataPrototype){
            return new VariableDataPrototypeWrapper((VariableDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}