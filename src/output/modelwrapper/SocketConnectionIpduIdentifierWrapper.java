package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SocketConnectionIpduIdentifierWrapper {

    
    private SocketConnectionIpduIdentifier socketConnectionIpduIdentifier;

    public SocketConnectionIpduIdentifierWrapper(SocketConnectionIpduIdentifier socketConnectionIpduIdentifier) {
        this.socketConnectionIpduIdentifier = socketConnectionIpduIdentifier;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(socketConnectionIpduIdentifier.getS())) {
            
            return socketConnectionIpduIdentifier.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(socketConnectionIpduIdentifier.getT())) {
            
            return socketConnectionIpduIdentifier.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getHeaderId() {
        
        if (CollUtil.isNotEmpty(socketConnectionIpduIdentifier.getHeaderId())) {
            
            return new PositiveIntegerWrapper(socketConnectionIpduIdentifier.getHeaderId());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getPduCollectionPduTimeout() {
        
        if (CollUtil.isNotEmpty(socketConnectionIpduIdentifier.getPduCollectionPduTimeout())) {
            
            return new TimeValueWrapper(socketConnectionIpduIdentifier.getPduCollectionPduTimeout());
            
        } else {
            return null;
        }
        
    }

    public PduCollectionTriggerEnumWrapper getPduCollectionTrigger() {
        
        if (CollUtil.isNotEmpty(socketConnectionIpduIdentifier.getPduCollectionTrigger())) {
            
            return new PduCollectionTriggerEnumWrapper(socketConnectionIpduIdentifier.getPduCollectionTrigger());
            
        } else {
            return null;
        }
        
    }

    public PduRefWrapper getPduRef() {
        
        if (CollUtil.isNotEmpty(socketConnectionIpduIdentifier.getPduRef())) {
            
            return new PduRefWrapper(socketConnectionIpduIdentifier.getPduRef());
            
        } else {
            return null;
        }
        
    }

    public PduTriggeringRefWrapper getPduTriggeringRef() {
        
        if (CollUtil.isNotEmpty(socketConnectionIpduIdentifier.getPduTriggeringRef())) {
            
            return new PduTriggeringRefWrapper(socketConnectionIpduIdentifier.getPduTriggeringRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RoutingGroupRefWrapper> getRoutingGroupRefs() {
        
        if (CollUtil.isNotEmpty(socketConnectionIpduIdentifier.getRoutingGroupRefs())) {
            ArrayList<RoutingGroupRef> originalList = socketConnectionIpduIdentifier.getRoutingGroupRefs();
            ArrayList<RoutingGroupRefWrapper> wrapperList = (ArrayList<RoutingGroupRefWrapper>)originalList.stream()
                .map(item -> new RoutingGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}