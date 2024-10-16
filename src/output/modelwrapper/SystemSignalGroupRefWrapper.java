package stdgui.data.model.modelwrapper;


    
    


     

public class SystemSignalGroupRefWrapper {

    
    
    private SystemSignalGroupRef systemSignalGroupRef;

    public SystemSignalGroupRefWrapper(SystemSignalGroupRef systemSignalGroupRef) {
        this.systemSignalGroupRef = systemSignalGroupRef;
    }

   
    public SystemSignalGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(systemSignalGroupRef.getDest())) {
            
            return systemSignalGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSystemSignalGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = systemSignalGroupRef.getValue();
        java.lang.String type = systemSignalGroupRef.getDest().toString().replace("_", "-");
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

    
    public SystemSignalGroupWrapper getSystemSignalGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = systemSignalGroupRef.getValue();
        java.lang.String type = systemSignalGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SystemSignalGroup){
            return new SystemSignalGroupWrapper((SystemSignalGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}