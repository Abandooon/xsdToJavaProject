package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

public class ConnectorRef_CanTpNodeWrapper {

    
    
    private ConnectorRef_CanTpNode connectorRef_CanTpNode;

    public ConnectorRef_CanTpNodeWrapper(ConnectorRef_CanTpNode connectorRef_CanTpNode) {
        this.connectorRef_CanTpNode = connectorRef_CanTpNode;
    }

   
    public CommunicationConnectorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(connectorRef_CanTpNode.getDest())) {
            
            return connectorRef_CanTpNode.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getConnectorRef_CanTpNodeObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = connectorRef_CanTpNode.getValue();
        java.lang.String type = connectorRef_CanTpNode.getDest().toString().replace("_", "-");
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

    
    public CanCommunicationConnectorWrapper getCanCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = connectorRef_CanTpNode.getValue();
        java.lang.String type = connectorRef_CanTpNode.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanCommunicationConnector){
            return new CanCommunicationConnectorWrapper((CanCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetCommunicationConnectorWrapper getEthernetCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = connectorRef_CanTpNode.getValue();
        java.lang.String type = connectorRef_CanTpNode.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetCommunicationConnector){
            return new EthernetCommunicationConnectorWrapper((EthernetCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayCommunicationConnectorWrapper getFlexrayCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = connectorRef_CanTpNode.getValue();
        java.lang.String type = connectorRef_CanTpNode.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayCommunicationConnector){
            return new FlexrayCommunicationConnectorWrapper((FlexrayCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinCommunicationConnectorWrapper getLinCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = connectorRef_CanTpNode.getValue();
        java.lang.String type = connectorRef_CanTpNode.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinCommunicationConnector){
            return new LinCommunicationConnectorWrapper((LinCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TtcanCommunicationConnectorWrapper getTtcanCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = connectorRef_CanTpNode.getValue();
        java.lang.String type = connectorRef_CanTpNode.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TtcanCommunicationConnector){
            return new TtcanCommunicationConnectorWrapper((TtcanCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedCommunicationConnectorWrapper getUserDefinedCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = connectorRef_CanTpNode.getValue();
        java.lang.String type = connectorRef_CanTpNode.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedCommunicationConnector){
            return new UserDefinedCommunicationConnectorWrapper((UserDefinedCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}