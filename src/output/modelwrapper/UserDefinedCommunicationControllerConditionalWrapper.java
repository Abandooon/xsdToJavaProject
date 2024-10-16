package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class UserDefinedCommunicationControllerConditionalWrapper {

    
    private UserDefinedCommunicationControllerConditional userDefinedCommunicationControllerConditional;

    public UserDefinedCommunicationControllerConditionalWrapper(UserDefinedCommunicationControllerConditional userDefinedCommunicationControllerConditional) {
        this.userDefinedCommunicationControllerConditional = userDefinedCommunicationControllerConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationControllerConditional.getS())) {
            
            return userDefinedCommunicationControllerConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationControllerConditional.getT())) {
            
            return userDefinedCommunicationControllerConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWakeUpByControllerSupported() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationControllerConditional.getWakeUpByControllerSupported())) {
            
            return new BooleanWrapper(userDefinedCommunicationControllerConditional.getWakeUpByControllerSupported());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationControllerConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(userDefinedCommunicationControllerConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}