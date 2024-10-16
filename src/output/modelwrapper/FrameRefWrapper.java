package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

public class FrameRefWrapper {

    
    
    private FrameRef frameRef;

    public FrameRefWrapper(FrameRef frameRef) {
        this.frameRef = frameRef;
    }

   
    public FrameSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(frameRef.getDest())) {
            
            return frameRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFrameRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = frameRef.getValue();
        java.lang.String type = frameRef.getDest().toString().replace("_", "-");
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

    
    public CanFrameWrapper getCanFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef.getValue();
        java.lang.String type = frameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanFrame){
            return new CanFrameWrapper((CanFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetFrameWrapper getEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef.getValue();
        java.lang.String type = frameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetFrame){
            return new EthernetFrameWrapper((EthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayFrameWrapper getFlexrayFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef.getValue();
        java.lang.String type = frameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayFrame){
            return new FlexrayFrameWrapper((FlexrayFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GenericEthernetFrameWrapper getGenericEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef.getValue();
        java.lang.String type = frameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GenericEthernetFrame){
            return new GenericEthernetFrameWrapper((GenericEthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public Ieee1722TpEthernetFrameWrapper getIeee1722TpEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef.getValue();
        java.lang.String type = frameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Ieee1722TpEthernetFrame){
            return new Ieee1722TpEthernetFrameWrapper((Ieee1722TpEthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinEventTriggeredFrameWrapper getLinEventTriggeredFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef.getValue();
        java.lang.String type = frameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinEventTriggeredFrame){
            return new LinEventTriggeredFrameWrapper((LinEventTriggeredFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinSporadicFrameWrapper getLinSporadicFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef.getValue();
        java.lang.String type = frameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinSporadicFrame){
            return new LinSporadicFrameWrapper((LinSporadicFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinUnconditionalFrameWrapper getLinUnconditionalFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef.getValue();
        java.lang.String type = frameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinUnconditionalFrame){
            return new LinUnconditionalFrameWrapper((LinUnconditionalFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedEthernetFrameWrapper getUserDefinedEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef.getValue();
        java.lang.String type = frameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedEthernetFrame){
            return new UserDefinedEthernetFrameWrapper((UserDefinedEthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}