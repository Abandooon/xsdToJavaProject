package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class BswModeReceiverPolicyWrapper {

    
    private BswModeReceiverPolicy bswModeReceiverPolicy;

    public BswModeReceiverPolicyWrapper(BswModeReceiverPolicy bswModeReceiverPolicy) {
        this.bswModeReceiverPolicy = bswModeReceiverPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModeReceiverPolicy.getS())) {
            
            return bswModeReceiverPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModeReceiverPolicy.getT())) {
            
            return bswModeReceiverPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnhancedModeApi() {
        
        if (CollUtil.isNotEmpty(bswModeReceiverPolicy.getEnhancedModeApi())) {
            
            return new BooleanWrapper(bswModeReceiverPolicy.getEnhancedModeApi());
            
        } else {
            return null;
        }
        
    }

    public RequiredModeGroupRefWrapper getRequiredModeGroupRef() {
        
        if (CollUtil.isNotEmpty(bswModeReceiverPolicy.getRequiredModeGroupRef())) {
            
            return new RequiredModeGroupRefWrapper(bswModeReceiverPolicy.getRequiredModeGroupRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSupportsAsynchronousModeSwitch() {
        
        if (CollUtil.isNotEmpty(bswModeReceiverPolicy.getSupportsAsynchronousModeSwitch())) {
            
            return new BooleanWrapper(bswModeReceiverPolicy.getSupportsAsynchronousModeSwitch());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModeReceiverPolicy.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModeReceiverPolicy.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}