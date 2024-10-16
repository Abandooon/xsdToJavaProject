package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class Connectors_CompositionSwComponentTypeWrapper {

    
    private Connectors_CompositionSwComponentType connectors_CompositionSwComponentType;

    public Connectors_CompositionSwComponentTypeWrapper(Connectors_CompositionSwComponentType connectors_CompositionSwComponentType) {
        this.connectors_CompositionSwComponentType = connectors_CompositionSwComponentType;
    }

   
    public ArrayList<AssemblySwConnectorWrapper> getAssemblySwConnector() {
        
        if (CollUtil.isNotEmpty(connectors_CompositionSwComponentType.getAssemblySwConnector())) {
            ArrayList<AssemblySwConnector> originalList = connectors_CompositionSwComponentType.getAssemblySwConnector();
            ArrayList<AssemblySwConnectorWrapper> wrapperList = (ArrayList<AssemblySwConnectorWrapper>)originalList.stream()
                .map(item -> new AssemblySwConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DelegationSwConnectorWrapper> getDelegationSwConnector() {
        
        if (CollUtil.isNotEmpty(connectors_CompositionSwComponentType.getDelegationSwConnector())) {
            ArrayList<DelegationSwConnector> originalList = connectors_CompositionSwComponentType.getDelegationSwConnector();
            ArrayList<DelegationSwConnectorWrapper> wrapperList = (ArrayList<DelegationSwConnectorWrapper>)originalList.stream()
                .map(item -> new DelegationSwConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PassThroughSwConnectorWrapper> getPassThroughSwConnector() {
        
        if (CollUtil.isNotEmpty(connectors_CompositionSwComponentType.getPassThroughSwConnector())) {
            ArrayList<PassThroughSwConnector> originalList = connectors_CompositionSwComponentType.getPassThroughSwConnector();
            ArrayList<PassThroughSwConnectorWrapper> wrapperList = (ArrayList<PassThroughSwConnectorWrapper>)originalList.stream()
                .map(item -> new PassThroughSwConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}