package stdgui.data.model.modelwrapper;


    
    


     

public class TimeSyncServerRefWrapper {

    
    
    private TimeSyncServerRef timeSyncServerRef;

    public TimeSyncServerRefWrapper(TimeSyncServerRef timeSyncServerRef) {
        this.timeSyncServerRef = timeSyncServerRef;
    }

   
    public TimeSyncServerConfigurationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(timeSyncServerRef.getDest())) {
            
            return timeSyncServerRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTimeSyncServerRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = timeSyncServerRef.getValue();
        java.lang.String type = timeSyncServerRef.getDest().toString().replace("_", "-");
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

    
    public TimeSyncServerConfigurationWrapper getTimeSyncServerConfiguration() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = timeSyncServerRef.getValue();
        java.lang.String type = timeSyncServerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TimeSyncServerConfiguration){
            return new TimeSyncServerConfigurationWrapper((TimeSyncServerConfiguration) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}