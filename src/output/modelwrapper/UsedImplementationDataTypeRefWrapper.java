package stdgui.data.model.modelwrapper;


    
    


     

public class UsedImplementationDataTypeRefWrapper {

    
    
    private UsedImplementationDataTypeRef usedImplementationDataTypeRef;

    public UsedImplementationDataTypeRefWrapper(UsedImplementationDataTypeRef usedImplementationDataTypeRef) {
        this.usedImplementationDataTypeRef = usedImplementationDataTypeRef;
    }

   
    public ImplementationDataTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(usedImplementationDataTypeRef.getDest())) {
            
            return usedImplementationDataTypeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getUsedImplementationDataTypeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = usedImplementationDataTypeRef.getValue();
        java.lang.String type = usedImplementationDataTypeRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = usedImplementationDataTypeRef.getValue();
        java.lang.String type = usedImplementationDataTypeRef.getDest().toString().replace("_", "-");
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