package stdgui.data.model.modelwrapper;


    
    


     

public class ConnectorRef_SocketAddressWrapper {

    
    
    private ConnectorRef_SocketAddress connectorRef_SocketAddress;

    public ConnectorRef_SocketAddressWrapper(ConnectorRef_SocketAddress connectorRef_SocketAddress) {
        this.connectorRef_SocketAddress = connectorRef_SocketAddress;
    }

   
    public EthernetCommunicationConnectorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(connectorRef_SocketAddress.getDest())) {
            
            return connectorRef_SocketAddress.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getConnectorRef_SocketAddressObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = connectorRef_SocketAddress.getValue();
        java.lang.String type = connectorRef_SocketAddress.getDest().toString().replace("_", "-");
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

    
    public EthernetCommunicationConnectorWrapper getEthernetCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = connectorRef_SocketAddress.getValue();
        java.lang.String type = connectorRef_SocketAddress.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetCommunicationConnector){
            return new EthernetCommunicationConnectorWrapper((EthernetCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}