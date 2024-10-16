package stdgui.data.model.modelwrapper;


    
    


     

     

     

public class SlaveRefWrapper {

    
    
    private SlaveRef slaveRef;

    public SlaveRefWrapper(SlaveRef slaveRef) {
        this.slaveRef = slaveRef;
    }

   
    public GlobalTimeSlaveSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(slaveRef.getDest())) {
            
            return slaveRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSlaveRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = slaveRef.getValue();
        java.lang.String type = slaveRef.getDest().toString().replace("_", "-");
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

    
    public GlobalTimeCanSlaveWrapper getGlobalTimeCanSlave() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = slaveRef.getValue();
        java.lang.String type = slaveRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeCanSlave){
            return new GlobalTimeCanSlaveWrapper((GlobalTimeCanSlave) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeEthSlaveWrapper getGlobalTimeEthSlave() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = slaveRef.getValue();
        java.lang.String type = slaveRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeEthSlave){
            return new GlobalTimeEthSlaveWrapper((GlobalTimeEthSlave) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeFrSlaveWrapper getGlobalTimeFrSlave() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = slaveRef.getValue();
        java.lang.String type = slaveRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeFrSlave){
            return new GlobalTimeFrSlaveWrapper((GlobalTimeFrSlave) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}