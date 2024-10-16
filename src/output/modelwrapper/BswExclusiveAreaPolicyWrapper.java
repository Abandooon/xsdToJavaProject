package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class BswExclusiveAreaPolicyWrapper {

    
    private BswExclusiveAreaPolicy bswExclusiveAreaPolicy;

    public BswExclusiveAreaPolicyWrapper(BswExclusiveAreaPolicy bswExclusiveAreaPolicy) {
        this.bswExclusiveAreaPolicy = bswExclusiveAreaPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswExclusiveAreaPolicy.getS())) {
            
            return bswExclusiveAreaPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswExclusiveAreaPolicy.getT())) {
            
            return bswExclusiveAreaPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnableTakeAddress() {
        
        if (CollUtil.isNotEmpty(bswExclusiveAreaPolicy.getEnableTakeAddress())) {
            
            return new BooleanWrapper(bswExclusiveAreaPolicy.getEnableTakeAddress());
            
        } else {
            return null;
        }
        
    }

    public ExclusiveAreaRefWrapper getExclusiveAreaRef() {
        
        if (CollUtil.isNotEmpty(bswExclusiveAreaPolicy.getExclusiveAreaRef())) {
            
            return new ExclusiveAreaRefWrapper(bswExclusiveAreaPolicy.getExclusiveAreaRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswExclusiveAreaPolicy.getVariationPoint())) {
            
            return new VariationPointWrapper(bswExclusiveAreaPolicy.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}