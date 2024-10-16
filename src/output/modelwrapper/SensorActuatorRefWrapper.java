package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

public class SensorActuatorRefWrapper {

    
    
    private SensorActuatorRef sensorActuatorRef;

    public SensorActuatorRefWrapper(SensorActuatorRef sensorActuatorRef) {
        this.sensorActuatorRef = sensorActuatorRef;
    }

   
    public HwDescriptionEntitySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(sensorActuatorRef.getDest())) {
            
            return sensorActuatorRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSensorActuatorRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = sensorActuatorRef.getValue();
        java.lang.String type = sensorActuatorRef.getDest().toString().replace("_", "-");
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

    
    public HwElementWrapper getHwElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = sensorActuatorRef.getValue();
        java.lang.String type = sensorActuatorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwElement){
            return new HwElementWrapper((HwElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwPinWrapper getHwPin() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = sensorActuatorRef.getValue();
        java.lang.String type = sensorActuatorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwPin){
            return new HwPinWrapper((HwPin) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwPinGroupWrapper getHwPinGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = sensorActuatorRef.getValue();
        java.lang.String type = sensorActuatorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwPinGroup){
            return new HwPinGroupWrapper((HwPinGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwTypeWrapper getHwType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = sensorActuatorRef.getValue();
        java.lang.String type = sensorActuatorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwType){
            return new HwTypeWrapper((HwType) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}