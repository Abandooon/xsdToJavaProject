package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class BswReleasedTriggerPolicyWrapper {

    
    private BswReleasedTriggerPolicy bswReleasedTriggerPolicy;

    public BswReleasedTriggerPolicyWrapper(BswReleasedTriggerPolicy bswReleasedTriggerPolicy) {
        this.bswReleasedTriggerPolicy = bswReleasedTriggerPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswReleasedTriggerPolicy.getS())) {
            
            return bswReleasedTriggerPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswReleasedTriggerPolicy.getT())) {
            
            return bswReleasedTriggerPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnableTakeAddress() {
        
        if (CollUtil.isNotEmpty(bswReleasedTriggerPolicy.getEnableTakeAddress())) {
            
            return new BooleanWrapper(bswReleasedTriggerPolicy.getEnableTakeAddress());
            
        } else {
            return null;
        }
        
    }

    public ReleasedTriggerRefWrapper getReleasedTriggerRef() {
        
        if (CollUtil.isNotEmpty(bswReleasedTriggerPolicy.getReleasedTriggerRef())) {
            
            return new ReleasedTriggerRefWrapper(bswReleasedTriggerPolicy.getReleasedTriggerRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswReleasedTriggerPolicy.getVariationPoint())) {
            
            return new VariationPointWrapper(bswReleasedTriggerPolicy.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}