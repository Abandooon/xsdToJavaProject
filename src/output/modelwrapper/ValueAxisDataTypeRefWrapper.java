package stdgui.data.model.modelwrapper;


    
    


     

public class ValueAxisDataTypeRefWrapper {

    
    
    private ValueAxisDataTypeRef valueAxisDataTypeRef;

    public ValueAxisDataTypeRefWrapper(ValueAxisDataTypeRef valueAxisDataTypeRef) {
        this.valueAxisDataTypeRef = valueAxisDataTypeRef;
    }

   
    public ApplicationPrimitiveDataTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(valueAxisDataTypeRef.getDest())) {
            
            return valueAxisDataTypeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getValueAxisDataTypeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = valueAxisDataTypeRef.getValue();
        java.lang.String type = valueAxisDataTypeRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = valueAxisDataTypeRef.getValue();
        java.lang.String type = valueAxisDataTypeRef.getDest().toString().replace("_", "-");
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