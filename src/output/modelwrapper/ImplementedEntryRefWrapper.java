package stdgui.data.model.modelwrapper;


    
    


     

public class ImplementedEntryRefWrapper {

    
    
    private ImplementedEntryRef implementedEntryRef;

    public ImplementedEntryRefWrapper(ImplementedEntryRef implementedEntryRef) {
        this.implementedEntryRef = implementedEntryRef;
    }

   
    public BswModuleEntrySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(implementedEntryRef.getDest())) {
            
            return implementedEntryRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getImplementedEntryRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = implementedEntryRef.getValue();
        java.lang.String type = implementedEntryRef.getDest().toString().replace("_", "-");
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

    
    public BswModuleEntryWrapper getBswModuleEntry() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = implementedEntryRef.getValue();
        java.lang.String type = implementedEntryRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModuleEntry){
            return new BswModuleEntryWrapper((BswModuleEntry) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}