package stdgui.data.model.modelwrapper;


    
    


     

public class InputVariableTypeRefWrapper {

    
    
    private InputVariableTypeRef inputVariableTypeRef;

    public InputVariableTypeRefWrapper(InputVariableTypeRef inputVariableTypeRef) {
        this.inputVariableTypeRef = inputVariableTypeRef;
    }

   
    public ApplicationPrimitiveDataTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(inputVariableTypeRef.getDest())) {
            
            return inputVariableTypeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getInputVariableTypeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = inputVariableTypeRef.getValue();
        java.lang.String type = inputVariableTypeRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = inputVariableTypeRef.getValue();
        java.lang.String type = inputVariableTypeRef.getDest().toString().replace("_", "-");
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