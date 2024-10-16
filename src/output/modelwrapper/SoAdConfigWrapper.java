package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.SocketAddress;
    


public class SoAdConfigWrapper {

    
    private SoAdConfig soAdConfig;

    public SoAdConfigWrapper(SoAdConfig soAdConfig) {
        this.soAdConfig = soAdConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(soAdConfig.getS())) {
            
            return soAdConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(soAdConfig.getT())) {
            
            return soAdConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SocketConnectionWrapper> getConnections() {
        
        if (CollUtil.isNotEmpty(soAdConfig.getConnections())) {
            ArrayList<SocketConnection> originalList = soAdConfig.getConnections();
            ArrayList<SocketConnectionWrapper> wrapperList = (ArrayList<SocketConnectionWrapper>)originalList.stream()
                .map(item -> new SocketConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SocketConnectionBundleWrapper> getConnectionBundles() {
        
        if (CollUtil.isNotEmpty(soAdConfig.getConnectionBundles())) {
            ArrayList<SocketConnectionBundle> originalList = soAdConfig.getConnectionBundles();
            ArrayList<SocketConnectionBundleWrapper> wrapperList = (ArrayList<SocketConnectionBundleWrapper>)originalList.stream()
                .map(item -> new SocketConnectionBundleWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LogicAddressWrapper> getLogicAddresss() {
        
        if (CollUtil.isNotEmpty(soAdConfig.getLogicAddresss())) {
            ArrayList<LogicAddress> originalList = soAdConfig.getLogicAddresss();
            ArrayList<LogicAddressWrapper> wrapperList = (ArrayList<LogicAddressWrapper>)originalList.stream()
                .map(item -> new LogicAddressWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SocketAddressWrapper> getSocketAddresss() {
        
        if (CollUtil.isNotEmpty(soAdConfig.getSocketAddresss())) {
            ArrayList<SocketAddress> originalList = soAdConfig.getSocketAddresss();
            ArrayList<SocketAddressWrapper> wrapperList = (ArrayList<SocketAddressWrapper>)originalList.stream()
                .map(item -> new SocketAddressWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}