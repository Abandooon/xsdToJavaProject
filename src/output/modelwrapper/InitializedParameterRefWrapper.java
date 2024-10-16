package stdgui.data.model.modelwrapper;


    
    


     

public class InitializedParameterRefWrapper {

    
    
    private InitializedParameterRef initializedParameterRef;

    public InitializedParameterRefWrapper(InitializedParameterRef initializedParameterRef) {
        this.initializedParameterRef = initializedParameterRef;
    }

   
    public FlatInstanceDescriptorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(initializedParameterRef.getDest())) {
            
            return initializedParameterRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getInitializedParameterRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = initializedParameterRef.getValue();
        java.lang.String type = initializedParameterRef.getDest().toString().replace("_", "-");
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

    
    public FlatInstanceDescriptorWrapper getFlatInstanceDescriptor() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = initializedParameterRef.getValue();
        java.lang.String type = initializedParameterRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlatInstanceDescriptor){
            return new FlatInstanceDescriptorWrapper((FlatInstanceDescriptor) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}