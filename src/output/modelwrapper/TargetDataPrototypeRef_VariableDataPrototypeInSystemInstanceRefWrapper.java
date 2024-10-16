package stdgui.data.model.modelwrapper;


    
    


     

public class TargetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRefWrapper {

    
    
    private TargetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef targetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef;

    public TargetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRefWrapper(TargetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef targetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef) {
        this.targetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef = targetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef;
    }

   
    public VariableDataPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef.getDest())) {
            
            return targetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef.getValue();
        java.lang.String type = targetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef.getValue();
        java.lang.String type = targetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef.getDest().toString().replace("_", "-");
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