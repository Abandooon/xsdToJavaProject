package stdgui.data.model.modelwrapper;


    
    


     

public class BswModuleEntryRefWrapper {

    
    
    private BswModuleEntryRef bswModuleEntryRef;

    public BswModuleEntryRefWrapper(BswModuleEntryRef bswModuleEntryRef) {
        this.bswModuleEntryRef = bswModuleEntryRef;
    }

   
    public BswModuleEntrySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(bswModuleEntryRef.getDest())) {
            
            return bswModuleEntryRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBswModuleEntryRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = bswModuleEntryRef.getValue();
        java.lang.String type = bswModuleEntryRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = bswModuleEntryRef.getValue();
        java.lang.String type = bswModuleEntryRef.getDest().toString().replace("_", "-");
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