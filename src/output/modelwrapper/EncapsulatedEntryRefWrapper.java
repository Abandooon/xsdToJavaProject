package stdgui.data.model.modelwrapper;


    
    


     

public class EncapsulatedEntryRefWrapper {

    
    
    private EncapsulatedEntryRef encapsulatedEntryRef;

    public EncapsulatedEntryRefWrapper(EncapsulatedEntryRef encapsulatedEntryRef) {
        this.encapsulatedEntryRef = encapsulatedEntryRef;
    }

   
    public BswModuleEntrySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(encapsulatedEntryRef.getDest())) {
            
            return encapsulatedEntryRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEncapsulatedEntryRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = encapsulatedEntryRef.getValue();
        java.lang.String type = encapsulatedEntryRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = encapsulatedEntryRef.getValue();
        java.lang.String type = encapsulatedEntryRef.getDest().toString().replace("_", "-");
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