package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class BswInternalTriggeringPointRefConditionalWrapper {

    
    private BswInternalTriggeringPointRefConditional bswInternalTriggeringPointRefConditional;

    public BswInternalTriggeringPointRefConditionalWrapper(BswInternalTriggeringPointRefConditional bswInternalTriggeringPointRefConditional) {
        this.bswInternalTriggeringPointRefConditional = bswInternalTriggeringPointRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPointRefConditional.getS())) {
            
            return bswInternalTriggeringPointRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPointRefConditional.getT())) {
            
            return bswInternalTriggeringPointRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BswInternalTriggeringPointRefWrapper getBswInternalTriggeringPointRef() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPointRefConditional.getBswInternalTriggeringPointRef())) {
            
            return new BswInternalTriggeringPointRefWrapper(bswInternalTriggeringPointRefConditional.getBswInternalTriggeringPointRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPointRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(bswInternalTriggeringPointRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}