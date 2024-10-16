package stdgui.data.model.modelwrapper;


    
    


     

public class FlatMapEntryRefWrapper {

    
    
    private FlatMapEntryRef flatMapEntryRef;

    public FlatMapEntryRefWrapper(FlatMapEntryRef flatMapEntryRef) {
        this.flatMapEntryRef = flatMapEntryRef;
    }

   
    public FlatInstanceDescriptorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(flatMapEntryRef.getDest())) {
            
            return flatMapEntryRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFlatMapEntryRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = flatMapEntryRef.getValue();
        java.lang.String type = flatMapEntryRef.getDest().toString().replace("_", "-");
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

    
    public FlatInstanceDescriptorWrapper getFlatInstanceDescriptor() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = flatMapEntryRef.getValue();
        java.lang.String type = flatMapEntryRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlatInstanceDescriptor){
            return new FlatInstanceDescriptorWrapper((FlatInstanceDescriptor) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}