package stdgui.data.model.modelwrapper;


    
    


     

public class StorageConditionGroupRefWrapper {

    
    
    private StorageConditionGroupRef storageConditionGroupRef;

    public StorageConditionGroupRefWrapper(StorageConditionGroupRef storageConditionGroupRef) {
        this.storageConditionGroupRef = storageConditionGroupRef;
    }

   
    public DiagnosticStorageConditionGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(storageConditionGroupRef.getDest())) {
            
            return storageConditionGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getStorageConditionGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = storageConditionGroupRef.getValue();
        java.lang.String type = storageConditionGroupRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticStorageConditionGroupWrapper getDiagnosticStorageConditionGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = storageConditionGroupRef.getValue();
        java.lang.String type = storageConditionGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticStorageConditionGroup){
            return new DiagnosticStorageConditionGroupWrapper((DiagnosticStorageConditionGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}