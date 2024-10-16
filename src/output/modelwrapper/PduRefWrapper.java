package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

public class PduRefWrapper {

    
    
    private PduRef pduRef;

    public PduRefWrapper(PduRef pduRef) {
        this.pduRef = pduRef;
    }

   
    public PduSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(pduRef.getDest())) {
            
            return pduRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPduRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
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

    
    public ContainerIPduWrapper getContainerIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ContainerIPdu){
            return new ContainerIPduWrapper((ContainerIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DcmIPduWrapper getDcmIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DcmIPdu){
            return new DcmIPduWrapper((DcmIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GeneralPurposeIPduWrapper getGeneralPurposeIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GeneralPurposeIPdu){
            return new GeneralPurposeIPduWrapper((GeneralPurposeIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GeneralPurposePduWrapper getGeneralPurposePdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GeneralPurposePdu){
            return new GeneralPurposePduWrapper((GeneralPurposePdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalIPduWrapper getISignalIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalIPdu){
            return new ISignalIPduWrapper((ISignalIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939DcmIPduWrapper getJ1939DcmIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939DcmIPdu){
            return new J1939DcmIPduWrapper((J1939DcmIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public MultiplexedIPduWrapper getMultiplexedIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof MultiplexedIPdu){
            return new MultiplexedIPduWrapper((MultiplexedIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NPduWrapper getNPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NPdu){
            return new NPduWrapper((NPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NmPduWrapper getNmPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NmPdu){
            return new NmPduWrapper((NmPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SecuredIPduWrapper getSecuredIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SecuredIPdu){
            return new SecuredIPduWrapper((SecuredIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedIPduWrapper getUserDefinedIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedIPdu){
            return new UserDefinedIPduWrapper((UserDefinedIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedPduWrapper getUserDefinedPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedPdu){
            return new UserDefinedPduWrapper((UserDefinedPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public XcpPduWrapper getXcpPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = pduRef.getValue();
        java.lang.String type = pduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof XcpPdu){
            return new XcpPduWrapper((XcpPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}