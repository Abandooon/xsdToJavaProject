package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class BswParameterPolicyWrapper {

    
    private BswParameterPolicy bswParameterPolicy;

    public BswParameterPolicyWrapper(BswParameterPolicy bswParameterPolicy) {
        this.bswParameterPolicy = bswParameterPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswParameterPolicy.getS())) {
            
            return bswParameterPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswParameterPolicy.getT())) {
            
            return bswParameterPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnableTakeAddress() {
        
        if (CollUtil.isNotEmpty(bswParameterPolicy.getEnableTakeAddress())) {
            
            return new BooleanWrapper(bswParameterPolicy.getEnableTakeAddress());
            
        } else {
            return null;
        }
        
    }

    public PerInstanceParameterRefWrapper getPerInstanceParameterRef() {
        
        if (CollUtil.isNotEmpty(bswParameterPolicy.getPerInstanceParameterRef())) {
            
            return new PerInstanceParameterRefWrapper(bswParameterPolicy.getPerInstanceParameterRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswParameterPolicy.getVariationPoint())) {
            
            return new VariationPointWrapper(bswParameterPolicy.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}