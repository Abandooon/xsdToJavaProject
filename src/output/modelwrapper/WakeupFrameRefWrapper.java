package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

public class WakeupFrameRefWrapper {

    
    
    private WakeupFrameRef wakeupFrameRef;

    public WakeupFrameRefWrapper(WakeupFrameRef wakeupFrameRef) {
        this.wakeupFrameRef = wakeupFrameRef;
    }

   
    public FrameTriggeringSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(wakeupFrameRef.getDest())) {
            
            return wakeupFrameRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getWakeupFrameRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = wakeupFrameRef.getValue();
        java.lang.String type = wakeupFrameRef.getDest().toString().replace("_", "-");
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

    
    public CanFrameTriggeringWrapper getCanFrameTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = wakeupFrameRef.getValue();
        java.lang.String type = wakeupFrameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanFrameTriggering){
            return new CanFrameTriggeringWrapper((CanFrameTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetFrameTriggeringWrapper getEthernetFrameTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = wakeupFrameRef.getValue();
        java.lang.String type = wakeupFrameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetFrameTriggering){
            return new EthernetFrameTriggeringWrapper((EthernetFrameTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayFrameTriggeringWrapper getFlexrayFrameTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = wakeupFrameRef.getValue();
        java.lang.String type = wakeupFrameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayFrameTriggering){
            return new FlexrayFrameTriggeringWrapper((FlexrayFrameTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinFrameTriggeringWrapper getLinFrameTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = wakeupFrameRef.getValue();
        java.lang.String type = wakeupFrameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinFrameTriggering){
            return new LinFrameTriggeringWrapper((LinFrameTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}