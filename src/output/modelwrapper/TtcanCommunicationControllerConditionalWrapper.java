package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class TtcanCommunicationControllerConditionalWrapper {

    
    private TtcanCommunicationControllerConditional ttcanCommunicationControllerConditional;

    public TtcanCommunicationControllerConditionalWrapper(TtcanCommunicationControllerConditional ttcanCommunicationControllerConditional) {
        this.ttcanCommunicationControllerConditional = ttcanCommunicationControllerConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getS())) {
            
            return ttcanCommunicationControllerConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getT())) {
            
            return ttcanCommunicationControllerConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWakeUpByControllerSupported() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getWakeUpByControllerSupported())) {
            
            return new BooleanWrapper(ttcanCommunicationControllerConditional.getWakeUpByControllerSupported());
            
        } else {
            return null;
        }
        
    }

    public CanControllerAttributesWrapper getCanControllerAttributes() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getCanControllerAttributes())) {
            
            return new CanControllerAttributesWrapper(ttcanCommunicationControllerConditional.getCanControllerAttributes());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getApplWatchdogLimit() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getApplWatchdogLimit())) {
            
            return new IntegerWrapper(ttcanCommunicationControllerConditional.getApplWatchdogLimit());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getExpectedTxTrigger() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getExpectedTxTrigger())) {
            
            return new IntegerWrapper(ttcanCommunicationControllerConditional.getExpectedTxTrigger());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getExternalClockSynchronisation() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getExternalClockSynchronisation())) {
            
            return new BooleanWrapper(ttcanCommunicationControllerConditional.getExternalClockSynchronisation());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getInitialRefOffset() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getInitialRefOffset())) {
            
            return new IntegerWrapper(ttcanCommunicationControllerConditional.getInitialRefOffset());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getMaster() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getMaster())) {
            
            return new BooleanWrapper(ttcanCommunicationControllerConditional.getMaster());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getTimeMasterPriority() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getTimeMasterPriority())) {
            
            return new IntegerWrapper(ttcanCommunicationControllerConditional.getTimeMasterPriority());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getTimeTriggeredCanLevel() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getTimeTriggeredCanLevel())) {
            
            return new IntegerWrapper(ttcanCommunicationControllerConditional.getTimeTriggeredCanLevel());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getTxEnableWindowLength() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getTxEnableWindowLength())) {
            
            return new IntegerWrapper(ttcanCommunicationControllerConditional.getTxEnableWindowLength());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationControllerConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(ttcanCommunicationControllerConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}