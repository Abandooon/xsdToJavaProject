package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class BswInternalTriggeringPointPolicyWrapper {

    
    private BswInternalTriggeringPointPolicy bswInternalTriggeringPointPolicy;

    public BswInternalTriggeringPointPolicyWrapper(BswInternalTriggeringPointPolicy bswInternalTriggeringPointPolicy) {
        this.bswInternalTriggeringPointPolicy = bswInternalTriggeringPointPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPointPolicy.getS())) {
            
            return bswInternalTriggeringPointPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPointPolicy.getT())) {
            
            return bswInternalTriggeringPointPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnableTakeAddress() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPointPolicy.getEnableTakeAddress())) {
            
            return new BooleanWrapper(bswInternalTriggeringPointPolicy.getEnableTakeAddress());
            
        } else {
            return null;
        }
        
    }

    public BswInternalTriggeringPointRefWrapper getBswInternalTriggeringPointRef() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPointPolicy.getBswInternalTriggeringPointRef())) {
            
            return new BswInternalTriggeringPointRefWrapper(bswInternalTriggeringPointPolicy.getBswInternalTriggeringPointRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPointPolicy.getVariationPoint())) {
            
            return new VariationPointWrapper(bswInternalTriggeringPointPolicy.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}