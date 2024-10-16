package stdgui.data.model.modelwrapper;


    
    


     

public class ImplementationDataTypeRefWrapper {

    
    
    private ImplementationDataTypeRef implementationDataTypeRef;

    public ImplementationDataTypeRefWrapper(ImplementationDataTypeRef implementationDataTypeRef) {
        this.implementationDataTypeRef = implementationDataTypeRef;
    }

   
    public ImplementationDataTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeRef.getDest())) {
            
            return implementationDataTypeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getImplementationDataTypeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = implementationDataTypeRef.getValue();
        java.lang.String type = implementationDataTypeRef.getDest().toString().replace("_", "-");
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

    
    public ImplementationDataTypeWrapper getImplementationDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = implementationDataTypeRef.getValue();
        java.lang.String type = implementationDataTypeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ImplementationDataType){
            return new ImplementationDataTypeWrapper((ImplementationDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}