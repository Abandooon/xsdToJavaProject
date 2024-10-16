package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SdServerConfigWrapper {

    
    private SdServerConfig sdServerConfig;

    public SdServerConfigWrapper(SdServerConfig sdServerConfig) {
        this.sdServerConfig = sdServerConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sdServerConfig.getS())) {
            
            return sdServerConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sdServerConfig.getT())) {
            
            return sdServerConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TagWithOptionalValueWrapper> getCapabilityRecords() {
        
        if (CollUtil.isNotEmpty(sdServerConfig.getCapabilityRecords())) {
            ArrayList<TagWithOptionalValue> originalList = sdServerConfig.getCapabilityRecords();
            ArrayList<TagWithOptionalValueWrapper> wrapperList = (ArrayList<TagWithOptionalValueWrapper>)originalList.stream()
                .map(item -> new TagWithOptionalValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public InitialSdDelayConfigWrapper getInitialOfferBehavior() {
        
        if (CollUtil.isNotEmpty(sdServerConfig.getInitialOfferBehavior())) {
            
            return new InitialSdDelayConfigWrapper(sdServerConfig.getInitialOfferBehavior());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getOfferCyclicDelay() {
        
        if (CollUtil.isNotEmpty(sdServerConfig.getOfferCyclicDelay())) {
            
            return new TimeValueWrapper(sdServerConfig.getOfferCyclicDelay());
            
        } else {
            return null;
        }
        
    }

    public RequestResponseDelayWrapper getRequestResponseDelay() {
        
        if (CollUtil.isNotEmpty(sdServerConfig.getRequestResponseDelay())) {
            
            return new RequestResponseDelayWrapper(sdServerConfig.getRequestResponseDelay());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getServerServiceMajorVersion() {
        
        if (CollUtil.isNotEmpty(sdServerConfig.getServerServiceMajorVersion())) {
            
            return new PositiveIntegerWrapper(sdServerConfig.getServerServiceMajorVersion());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getServerServiceMinorVersion() {
        
        if (CollUtil.isNotEmpty(sdServerConfig.getServerServiceMinorVersion())) {
            
            return new PositiveIntegerWrapper(sdServerConfig.getServerServiceMinorVersion());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getTtl() {
        
        if (CollUtil.isNotEmpty(sdServerConfig.getTtl())) {
            
            return new PositiveIntegerWrapper(sdServerConfig.getTtl());
            
        } else {
            return null;
        }
        
    }




    


    
}