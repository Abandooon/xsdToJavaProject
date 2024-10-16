package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SocketConnectionBundleWrapper {

    
    private SocketConnectionBundle socketConnectionBundle;

    public SocketConnectionBundleWrapper(SocketConnectionBundle socketConnectionBundle) {
        this.socketConnectionBundle = socketConnectionBundle;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(socketConnectionBundle.getS())) {
            
            return socketConnectionBundle.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(socketConnectionBundle.getT())) {
            
            return socketConnectionBundle.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(socketConnectionBundle.getShortName())) {
            
            return new IdentifierWrapper(socketConnectionBundle.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(socketConnectionBundle.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = socketConnectionBundle.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SocketConnectionWrapper> getBundledConnections() {
        
        if (CollUtil.isNotEmpty(socketConnectionBundle.getBundledConnections())) {
            ArrayList<SocketConnection> originalList = socketConnectionBundle.getBundledConnections();
            ArrayList<SocketConnectionWrapper> wrapperList = (ArrayList<SocketConnectionWrapper>)originalList.stream()
                .map(item -> new SocketConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SocketConnectionIpduIdentifierWrapper> getPdus() {
        
        if (CollUtil.isNotEmpty(socketConnectionBundle.getPdus())) {
            ArrayList<SocketConnectionIpduIdentifier> originalList = socketConnectionBundle.getPdus();
            ArrayList<SocketConnectionIpduIdentifierWrapper> wrapperList = (ArrayList<SocketConnectionIpduIdentifierWrapper>)originalList.stream()
                .map(item -> new SocketConnectionIpduIdentifierWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ServerPortRefWrapper getServerPortRef() {
        
        if (CollUtil.isNotEmpty(socketConnectionBundle.getServerPortRef())) {
            
            return new ServerPortRefWrapper(socketConnectionBundle.getServerPortRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(socketConnectionBundle.getVariationPoint())) {
            
            return new VariationPointWrapper(socketConnectionBundle.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}