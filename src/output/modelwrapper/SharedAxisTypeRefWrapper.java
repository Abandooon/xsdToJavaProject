package stdgui.data.model.modelwrapper;


    
    


     

public class SharedAxisTypeRefWrapper {

    
    
    private SharedAxisTypeRef sharedAxisTypeRef;

    public SharedAxisTypeRefWrapper(SharedAxisTypeRef sharedAxisTypeRef) {
        this.sharedAxisTypeRef = sharedAxisTypeRef;
    }

   
    public ApplicationPrimitiveDataTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(sharedAxisTypeRef.getDest())) {
            
            return sharedAxisTypeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSharedAxisTypeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = sharedAxisTypeRef.getValue();
        java.lang.String type = sharedAxisTypeRef.getDest().toString().replace("_", "-");
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

    
    public ApplicationPrimitiveDataTypeWrapper getApplicationPrimitiveDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = sharedAxisTypeRef.getValue();
        java.lang.String type = sharedAxisTypeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationPrimitiveDataType){
            return new ApplicationPrimitiveDataTypeWrapper((ApplicationPrimitiveDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}