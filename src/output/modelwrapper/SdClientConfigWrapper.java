package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SdClientConfigWrapper {

    
    private SdClientConfig sdClientConfig;

    public SdClientConfigWrapper(SdClientConfig sdClientConfig) {
        this.sdClientConfig = sdClientConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sdClientConfig.getS())) {
            
            return sdClientConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sdClientConfig.getT())) {
            
            return sdClientConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TagWithOptionalValueWrapper> getCapabilityRecords() {
        
        if (CollUtil.isNotEmpty(sdClientConfig.getCapabilityRecords())) {
            ArrayList<TagWithOptionalValue> originalList = sdClientConfig.getCapabilityRecords();
            ArrayList<TagWithOptionalValueWrapper> wrapperList = (ArrayList<TagWithOptionalValueWrapper>)originalList.stream()
                .map(item -> new TagWithOptionalValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getClientServiceMajorVersion() {
        
        if (CollUtil.isNotEmpty(sdClientConfig.getClientServiceMajorVersion())) {
            
            return new PositiveIntegerWrapper(sdClientConfig.getClientServiceMajorVersion());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getClientServiceMinorVersion() {
        
        if (CollUtil.isNotEmpty(sdClientConfig.getClientServiceMinorVersion())) {
            
            return new PositiveIntegerWrapper(sdClientConfig.getClientServiceMinorVersion());
            
        } else {
            return null;
        }
        
    }

    public InitialSdDelayConfigWrapper getInitialFindBehavior() {
        
        if (CollUtil.isNotEmpty(sdClientConfig.getInitialFindBehavior())) {
            
            return new InitialSdDelayConfigWrapper(sdClientConfig.getInitialFindBehavior());
            
        } else {
            return null;
        }
        
    }

    public RequestResponseDelayWrapper getRequestResponseDelay() {
        
        if (CollUtil.isNotEmpty(sdClientConfig.getRequestResponseDelay())) {
            
            return new RequestResponseDelayWrapper(sdClientConfig.getRequestResponseDelay());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getTtl() {
        
        if (CollUtil.isNotEmpty(sdClientConfig.getTtl())) {
            
            return new PositiveIntegerWrapper(sdClientConfig.getTtl());
            
        } else {
            return null;
        }
        
    }




    


    
}