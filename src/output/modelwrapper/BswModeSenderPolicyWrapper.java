package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class BswModeSenderPolicyWrapper {

    
    private BswModeSenderPolicy bswModeSenderPolicy;

    public BswModeSenderPolicyWrapper(BswModeSenderPolicy bswModeSenderPolicy) {
        this.bswModeSenderPolicy = bswModeSenderPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModeSenderPolicy.getS())) {
            
            return bswModeSenderPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModeSenderPolicy.getT())) {
            
            return bswModeSenderPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public BswModeSwitchAckRequestWrapper getAckRequest() {
        
        if (CollUtil.isNotEmpty(bswModeSenderPolicy.getAckRequest())) {
            
            return new BswModeSwitchAckRequestWrapper(bswModeSenderPolicy.getAckRequest());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnhancedModeApi() {
        
        if (CollUtil.isNotEmpty(bswModeSenderPolicy.getEnhancedModeApi())) {
            
            return new BooleanWrapper(bswModeSenderPolicy.getEnhancedModeApi());
            
        } else {
            return null;
        }
        
    }

    public ProvidedModeGroupRefWrapper getProvidedModeGroupRef() {
        
        if (CollUtil.isNotEmpty(bswModeSenderPolicy.getProvidedModeGroupRef())) {
            
            return new ProvidedModeGroupRefWrapper(bswModeSenderPolicy.getProvidedModeGroupRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getQueueLength() {
        
        if (CollUtil.isNotEmpty(bswModeSenderPolicy.getQueueLength())) {
            
            return new PositiveIntegerWrapper(bswModeSenderPolicy.getQueueLength());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModeSenderPolicy.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModeSenderPolicy.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}