package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.EventHandler;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EventHandlerWrapper {

    
    private EventHandler eventHandler;

    public EventHandlerWrapper(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(eventHandler.getS())) {
            
            return eventHandler.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(eventHandler.getT())) {
            
            return eventHandler.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(eventHandler.getShortName())) {
            
            return new IdentifierWrapper(eventHandler.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(eventHandler.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = eventHandler.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ApplicationEndpointRefWrapper getApplicationEndpointRef() {
        
        if (CollUtil.isNotEmpty(eventHandler.getApplicationEndpointRef())) {
            
            return new ApplicationEndpointRefWrapper(eventHandler.getApplicationEndpointRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsumedEventGroupRefWrapper> getConsumedEventGroupRefs() {
        
        if (CollUtil.isNotEmpty(eventHandler.getConsumedEventGroupRefs())) {
            ArrayList<ConsumedEventGroupRef> originalList = eventHandler.getConsumedEventGroupRefs();
            ArrayList<ConsumedEventGroupRefWrapper> wrapperList = (ArrayList<ConsumedEventGroupRefWrapper>)originalList.stream()
                .map(item -> new ConsumedEventGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMulticastThreshold() {
        
        if (CollUtil.isNotEmpty(eventHandler.getMulticastThreshold())) {
            
            return new PositiveIntegerWrapper(eventHandler.getMulticastThreshold());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RoutingGroupRefWrapper> getRoutingGroupRefs() {
        
        if (CollUtil.isNotEmpty(eventHandler.getRoutingGroupRefs())) {
            ArrayList<RoutingGroupRef> originalList = eventHandler.getRoutingGroupRefs();
            ArrayList<RoutingGroupRefWrapper> wrapperList = (ArrayList<RoutingGroupRefWrapper>)originalList.stream()
                .map(item -> new RoutingGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SdServerConfigWrapper getSdServerConfig() {
        
        if (CollUtil.isNotEmpty(eventHandler.getSdServerConfig())) {
            
            return new SdServerConfigWrapper(eventHandler.getSdServerConfig());
            
        } else {
            return null;
        }
        
    }




    


    
}