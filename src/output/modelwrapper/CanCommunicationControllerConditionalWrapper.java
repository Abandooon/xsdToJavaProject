package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class CanCommunicationControllerConditionalWrapper {

    
    private CanCommunicationControllerConditional canCommunicationControllerConditional;

    public CanCommunicationControllerConditionalWrapper(CanCommunicationControllerConditional canCommunicationControllerConditional) {
        this.canCommunicationControllerConditional = canCommunicationControllerConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canCommunicationControllerConditional.getS())) {
            
            return canCommunicationControllerConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canCommunicationControllerConditional.getT())) {
            
            return canCommunicationControllerConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWakeUpByControllerSupported() {
        
        if (CollUtil.isNotEmpty(canCommunicationControllerConditional.getWakeUpByControllerSupported())) {
            
            return new BooleanWrapper(canCommunicationControllerConditional.getWakeUpByControllerSupported());
            
        } else {
            return null;
        }
        
    }

    public CanControllerAttributesWrapper getCanControllerAttributes() {
        
        if (CollUtil.isNotEmpty(canCommunicationControllerConditional.getCanControllerAttributes())) {
            
            return new CanControllerAttributesWrapper(canCommunicationControllerConditional.getCanControllerAttributes());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canCommunicationControllerConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(canCommunicationControllerConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}