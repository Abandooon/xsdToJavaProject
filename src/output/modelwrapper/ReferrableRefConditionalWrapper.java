package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ReferrableRefConditionalWrapper {

    
    private ReferrableRefConditional referrableRefConditional;

    public ReferrableRefConditionalWrapper(ReferrableRefConditional referrableRefConditional) {
        this.referrableRefConditional = referrableRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(referrableRefConditional.getS())) {
            
            return referrableRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(referrableRefConditional.getT())) {
            
            return referrableRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public ReferrableRefWrapper getReferrableRef() {
        
        if (CollUtil.isNotEmpty(referrableRefConditional.getReferrableRef())) {
            
            return new ReferrableRefWrapper(referrableRefConditional.getReferrableRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(referrableRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(referrableRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}