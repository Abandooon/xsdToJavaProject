package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PduTriggeringRefConditionalWrapper {

    
    private PduTriggeringRefConditional pduTriggeringRefConditional;

    public PduTriggeringRefConditionalWrapper(PduTriggeringRefConditional pduTriggeringRefConditional) {
        this.pduTriggeringRefConditional = pduTriggeringRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pduTriggeringRefConditional.getS())) {
            
            return pduTriggeringRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pduTriggeringRefConditional.getT())) {
            
            return pduTriggeringRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public PduTriggeringRefWrapper getPduTriggeringRef() {
        
        if (CollUtil.isNotEmpty(pduTriggeringRefConditional.getPduTriggeringRef())) {
            
            return new PduTriggeringRefWrapper(pduTriggeringRefConditional.getPduTriggeringRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(pduTriggeringRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(pduTriggeringRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}