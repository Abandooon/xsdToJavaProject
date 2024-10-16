package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TriggerRefConditionalWrapper {

    
    private TriggerRefConditional triggerRefConditional;

    public TriggerRefConditionalWrapper(TriggerRefConditional triggerRefConditional) {
        this.triggerRefConditional = triggerRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(triggerRefConditional.getS())) {
            
            return triggerRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(triggerRefConditional.getT())) {
            
            return triggerRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public TriggerRefWrapper getTriggerRef() {
        
        if (CollUtil.isNotEmpty(triggerRefConditional.getTriggerRef())) {
            
            return new TriggerRefWrapper(triggerRefConditional.getTriggerRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(triggerRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(triggerRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}