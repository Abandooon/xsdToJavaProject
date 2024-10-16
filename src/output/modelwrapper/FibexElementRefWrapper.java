package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

public class FibexElementRefWrapper {

    
    
    private FibexElementRef fibexElementRef;

    public FibexElementRefWrapper(FibexElementRef fibexElementRef) {
        this.fibexElementRef = fibexElementRef;
    }

   
    public FibexElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(fibexElementRef.getDest())) {
            
            return fibexElementRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFibexElementRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
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

    
    public CanClusterWrapper getCanCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanCluster){
            return new CanClusterWrapper((CanCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanFrameWrapper getCanFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanFrame){
            return new CanFrameWrapper((CanFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanTpConfigWrapper getCanTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanTpConfig){
            return new CanTpConfigWrapper((CanTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ContainerIPduWrapper getContainerIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ContainerIPdu){
            return new ContainerIPduWrapper((ContainerIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CouplingElementWrapper getCouplingElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingElement){
            return new CouplingElementWrapper((CouplingElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DcmIPduWrapper getDcmIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DcmIPdu){
            return new DcmIPduWrapper((DcmIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpTpConfigWrapper getDoIpTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpTpConfig){
            return new DoIpTpConfigWrapper((DoIpTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuInstanceWrapper getEcuInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuInstance){
            return new EcuInstanceWrapper((EcuInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetClusterWrapper getEthernetCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetCluster){
            return new EthernetClusterWrapper((EthernetCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetFrameWrapper getEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetFrame){
            return new EthernetFrameWrapper((EthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayArTpConfigWrapper getFlexrayArTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayArTpConfig){
            return new FlexrayArTpConfigWrapper((FlexrayArTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayClusterWrapper getFlexrayCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayCluster){
            return new FlexrayClusterWrapper((FlexrayCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayFrameWrapper getFlexrayFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayFrame){
            return new FlexrayFrameWrapper((FlexrayFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayTpConfigWrapper getFlexrayTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayTpConfig){
            return new FlexrayTpConfigWrapper((FlexrayTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GatewayWrapper getGateway() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Gateway){
            return new GatewayWrapper((Gateway) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GeneralPurposeIPduWrapper getGeneralPurposeIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GeneralPurposePdu){
            return new GeneralPurposePduWrapper((GeneralPurposePdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GenericEthernetFrameWrapper getGenericEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GenericEthernetFrame){
            return new GenericEthernetFrameWrapper((GenericEthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeDomainWrapper getGlobalTimeDomain() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeDomain){
            return new GlobalTimeDomainWrapper((GlobalTimeDomain) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalWrapper getISignal() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignal){
            return new ISignalWrapper((ISignal) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalGroupWrapper getISignalGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalGroup){
            return new ISignalGroupWrapper((ISignalGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalIPduWrapper getISignalIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalIPdu){
            return new ISignalIPduWrapper((ISignalIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalIPduGroupWrapper getISignalIPduGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalIPduGroup){
            return new ISignalIPduGroupWrapper((ISignalIPduGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public Ieee1722TpEthernetFrameWrapper getIeee1722TpEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Ieee1722TpEthernetFrame){
            return new Ieee1722TpEthernetFrameWrapper((Ieee1722TpEthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939ClusterWrapper getJ1939Cluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939Cluster){
            return new J1939ClusterWrapper((J1939Cluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939DcmIPduWrapper getJ1939DcmIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939DcmIPdu){
            return new J1939DcmIPduWrapper((J1939DcmIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939TpConfigWrapper getJ1939TpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939TpConfig){
            return new J1939TpConfigWrapper((J1939TpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinClusterWrapper getLinCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinCluster){
            return new LinClusterWrapper((LinCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinEventTriggeredFrameWrapper getLinEventTriggeredFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinSporadicFrame){
            return new LinSporadicFrameWrapper((LinSporadicFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinTpConfigWrapper getLinTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinTpConfig){
            return new LinTpConfigWrapper((LinTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinUnconditionalFrameWrapper getLinUnconditionalFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinUnconditionalFrame){
            return new LinUnconditionalFrameWrapper((LinUnconditionalFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public MultiplexedIPduWrapper getMultiplexedIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NPdu){
            return new NPduWrapper((NPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NmConfigWrapper getNmConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NmConfig){
            return new NmConfigWrapper((NmConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NmPduWrapper getNmPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NmPdu){
            return new NmPduWrapper((NmPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PdurIPduGroupWrapper getPdurIPduGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PdurIPduGroup){
            return new PdurIPduGroupWrapper((PdurIPduGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SecuredIPduWrapper getSecuredIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SecuredIPdu){
            return new SecuredIPduWrapper((SecuredIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SoAdRoutingGroupWrapper getSoAdRoutingGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SoAdRoutingGroup){
            return new SoAdRoutingGroupWrapper((SoAdRoutingGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TtcanClusterWrapper getTtcanCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TtcanCluster){
            return new TtcanClusterWrapper((TtcanCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedClusterWrapper getUserDefinedCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedCluster){
            return new UserDefinedClusterWrapper((UserDefinedCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedEthernetFrameWrapper getUserDefinedEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedEthernetFrame){
            return new UserDefinedEthernetFrameWrapper((UserDefinedEthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedIPduWrapper getUserDefinedIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = fibexElementRef.getValue();
        java.lang.String type = fibexElementRef.getDest().toString().replace("_", "-");
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