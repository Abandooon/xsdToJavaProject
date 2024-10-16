package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

public class TargetDataPrototypeRef_DataPrototypeInSystemInstanceRefWrapper {

    
    
    private TargetDataPrototypeRef_DataPrototypeInSystemInstanceRef targetDataPrototypeRef_DataPrototypeInSystemInstanceRef;

    public TargetDataPrototypeRef_DataPrototypeInSystemInstanceRefWrapper(TargetDataPrototypeRef_DataPrototypeInSystemInstanceRef targetDataPrototypeRef_DataPrototypeInSystemInstanceRef) {
        this.targetDataPrototypeRef_DataPrototypeInSystemInstanceRef = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef;
    }

   
    public DataPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getDest())) {
            
            return targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetDataPrototypeRef_DataPrototypeInSystemInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getValue();
        java.lang.String type = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getDest().toString().replace("_", "-");
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

    
    public ApplicationArrayElementWrapper getApplicationArrayElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getValue();
        java.lang.String type = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationArrayElement){
            return new ApplicationArrayElementWrapper((ApplicationArrayElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationRecordElementWrapper getApplicationRecordElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getValue();
        java.lang.String type = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationRecordElement){
            return new ApplicationRecordElementWrapper((ApplicationRecordElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ArgumentDataPrototypeWrapper getArgumentDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getValue();
        java.lang.String type = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ArgumentDataPrototype){
            return new ArgumentDataPrototypeWrapper((ArgumentDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ParameterDataPrototypeWrapper getParameterDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getValue();
        java.lang.String type = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterDataPrototype){
            return new ParameterDataPrototypeWrapper((ParameterDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VariableDataPrototypeWrapper getVariableDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getValue();
        java.lang.String type = targetDataPrototypeRef_DataPrototypeInSystemInstanceRef.getDest().toString().replace("_", "-");
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