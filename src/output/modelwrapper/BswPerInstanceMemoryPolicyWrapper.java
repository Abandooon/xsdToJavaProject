package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class BswPerInstanceMemoryPolicyWrapper {

    
    private BswPerInstanceMemoryPolicy bswPerInstanceMemoryPolicy;

    public BswPerInstanceMemoryPolicyWrapper(BswPerInstanceMemoryPolicy bswPerInstanceMemoryPolicy) {
        this.bswPerInstanceMemoryPolicy = bswPerInstanceMemoryPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswPerInstanceMemoryPolicy.getS())) {
            
            return bswPerInstanceMemoryPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswPerInstanceMemoryPolicy.getT())) {
            
            return bswPerInstanceMemoryPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnableTakeAddress() {
        
        if (CollUtil.isNotEmpty(bswPerInstanceMemoryPolicy.getEnableTakeAddress())) {
            
            return new BooleanWrapper(bswPerInstanceMemoryPolicy.getEnableTakeAddress());
            
        } else {
            return null;
        }
        
    }

    public ArTypedPerInstanceMemoryRefWrapper getArTypedPerInstanceMemoryRef() {
        
        if (CollUtil.isNotEmpty(bswPerInstanceMemoryPolicy.getArTypedPerInstanceMemoryRef())) {
            
            return new ArTypedPerInstanceMemoryRefWrapper(bswPerInstanceMemoryPolicy.getArTypedPerInstanceMemoryRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswPerInstanceMemoryPolicy.getVariationPoint())) {
            
            return new VariationPointWrapper(bswPerInstanceMemoryPolicy.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}