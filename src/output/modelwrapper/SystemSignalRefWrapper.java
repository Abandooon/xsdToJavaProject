package stdgui.data.model.modelwrapper;


    
    


     

public class SystemSignalRefWrapper {

    
    
    private SystemSignalRef systemSignalRef;

    public SystemSignalRefWrapper(SystemSignalRef systemSignalRef) {
        this.systemSignalRef = systemSignalRef;
    }

   
    public SystemSignalSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(systemSignalRef.getDest())) {
            
            return systemSignalRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSystemSignalRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = systemSignalRef.getValue();
        java.lang.String type = systemSignalRef.getDest().toString().replace("_", "-");
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

    
    public SystemSignalWrapper getSystemSignal() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = systemSignalRef.getValue();
        java.lang.String type = systemSignalRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SystemSignal){
            return new SystemSignalWrapper((SystemSignal) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}