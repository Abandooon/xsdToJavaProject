package stdgui.data.model.modelwrapper;


    
    


     

public class EntryRefWrapper {

    
    
    private EntryRef entryRef;

    public EntryRefWrapper(EntryRef entryRef) {
        this.entryRef = entryRef;
    }

   
    public BswModuleClientServerEntrySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(entryRef.getDest())) {
            
            return entryRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEntryRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = entryRef.getValue();
        java.lang.String type = entryRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = entryRef.getValue();
        java.lang.String type = entryRef.getDest().toString().replace("_", "-");
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