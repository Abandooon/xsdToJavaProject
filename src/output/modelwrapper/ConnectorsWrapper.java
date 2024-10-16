package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class ConnectorsWrapper {

    
    private Connectors connectors;

    public ConnectorsWrapper(Connectors connectors) {
        this.connectors = connectors;
    }

   
    public ArrayList<CanCommunicationConnectorWrapper> getCanCommunicationConnector() {
        
        if (CollUtil.isNotEmpty(connectors.getCanCommunicationConnector())) {
            ArrayList<CanCommunicationConnector> originalList = connectors.getCanCommunicationConnector();
            ArrayList<CanCommunicationConnectorWrapper> wrapperList = (ArrayList<CanCommunicationConnectorWrapper>)originalList.stream()
                .map(item -> new CanCommunicationConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EthernetCommunicationConnectorWrapper> getEthernetCommunicationConnector() {
        
        if (CollUtil.isNotEmpty(connectors.getEthernetCommunicationConnector())) {
            ArrayList<EthernetCommunicationConnector> originalList = connectors.getEthernetCommunicationConnector();
            ArrayList<EthernetCommunicationConnectorWrapper> wrapperList = (ArrayList<EthernetCommunicationConnectorWrapper>)originalList.stream()
                .map(item -> new EthernetCommunicationConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayCommunicationConnectorWrapper> getFlexrayCommunicationConnector() {
        
        if (CollUtil.isNotEmpty(connectors.getFlexrayCommunicationConnector())) {
            ArrayList<FlexrayCommunicationConnector> originalList = connectors.getFlexrayCommunicationConnector();
            ArrayList<FlexrayCommunicationConnectorWrapper> wrapperList = (ArrayList<FlexrayCommunicationConnectorWrapper>)originalList.stream()
                .map(item -> new FlexrayCommunicationConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinCommunicationConnectorWrapper> getLinCommunicationConnector() {
        
        if (CollUtil.isNotEmpty(connectors.getLinCommunicationConnector())) {
            ArrayList<LinCommunicationConnector> originalList = connectors.getLinCommunicationConnector();
            ArrayList<LinCommunicationConnectorWrapper> wrapperList = (ArrayList<LinCommunicationConnectorWrapper>)originalList.stream()
                .map(item -> new LinCommunicationConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TtcanCommunicationConnectorWrapper> getTtcanCommunicationConnector() {
        
        if (CollUtil.isNotEmpty(connectors.getTtcanCommunicationConnector())) {
            ArrayList<TtcanCommunicationConnector> originalList = connectors.getTtcanCommunicationConnector();
            ArrayList<TtcanCommunicationConnectorWrapper> wrapperList = (ArrayList<TtcanCommunicationConnectorWrapper>)originalList.stream()
                .map(item -> new TtcanCommunicationConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedCommunicationConnectorWrapper> getUserDefinedCommunicationConnector() {
        
        if (CollUtil.isNotEmpty(connectors.getUserDefinedCommunicationConnector())) {
            ArrayList<UserDefinedCommunicationConnector> originalList = connectors.getUserDefinedCommunicationConnector();
            ArrayList<UserDefinedCommunicationConnectorWrapper> wrapperList = (ArrayList<UserDefinedCommunicationConnectorWrapper>)originalList.stream()
                .map(item -> new UserDefinedCommunicationConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}