package stdgui.data.model.modelwrapper;


    
    


     

public class RequiredClientServerEntryRefWrapper {

    
    
    private RequiredClientServerEntryRef requiredClientServerEntryRef;

    public RequiredClientServerEntryRefWrapper(RequiredClientServerEntryRef requiredClientServerEntryRef) {
        this.requiredClientServerEntryRef = requiredClientServerEntryRef;
    }

   
    public BswModuleClientServerEntrySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(requiredClientServerEntryRef.getDest())) {
            
            return requiredClientServerEntryRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRequiredClientServerEntryRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = requiredClientServerEntryRef.getValue();
        java.lang.String type = requiredClientServerEntryRef.getDest().toString().replace("_", "-");
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

    
    public BswModuleClientServerEntryWrapper getBswModuleClientServerEntry() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = requiredClientServerEntryRef.getValue();
        java.lang.String type = requiredClientServerEntryRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModuleClientServerEntry){
            return new BswModuleClientServerEntryWrapper((BswModuleClientServerEntry) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}