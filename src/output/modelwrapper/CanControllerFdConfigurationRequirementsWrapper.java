package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class CanControllerFdConfigurationRequirementsWrapper {

    
    private CanControllerFdConfigurationRequirements canControllerFdConfigurationRequirements;

    public CanControllerFdConfigurationRequirementsWrapper(CanControllerFdConfigurationRequirements canControllerFdConfigurationRequirements) {
        this.canControllerFdConfigurationRequirements = canControllerFdConfigurationRequirements;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getS())) {
            
            return canControllerFdConfigurationRequirements.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getT())) {
            
            return canControllerFdConfigurationRequirements.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxNumberOfTimeQuantaPerBit() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getMaxNumberOfTimeQuantaPerBit())) {
            
            return new IntegerWrapper(canControllerFdConfigurationRequirements.getMaxNumberOfTimeQuantaPerBit());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getMaxSamplePoint() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getMaxSamplePoint())) {
            
            return new FloatWrapper(canControllerFdConfigurationRequirements.getMaxSamplePoint());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getMaxSyncJumpWidth() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getMaxSyncJumpWidth())) {
            
            return new FloatWrapper(canControllerFdConfigurationRequirements.getMaxSyncJumpWidth());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMaxTrcvDelayCompensationOffset() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getMaxTrcvDelayCompensationOffset())) {
            
            return new TimeValueWrapper(canControllerFdConfigurationRequirements.getMaxTrcvDelayCompensationOffset());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMinNumberOfTimeQuantaPerBit() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getMinNumberOfTimeQuantaPerBit())) {
            
            return new IntegerWrapper(canControllerFdConfigurationRequirements.getMinNumberOfTimeQuantaPerBit());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getMinSamplePoint() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getMinSamplePoint())) {
            
            return new FloatWrapper(canControllerFdConfigurationRequirements.getMinSamplePoint());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getMinSyncJumpWidth() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getMinSyncJumpWidth())) {
            
            return new FloatWrapper(canControllerFdConfigurationRequirements.getMinSyncJumpWidth());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMinTrcvDelayCompensationOffset() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getMinTrcvDelayCompensationOffset())) {
            
            return new TimeValueWrapper(canControllerFdConfigurationRequirements.getMinTrcvDelayCompensationOffset());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPaddingValue() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getPaddingValue())) {
            
            return new PositiveIntegerWrapper(canControllerFdConfigurationRequirements.getPaddingValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getTxBitRateSwitch() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfigurationRequirements.getTxBitRateSwitch())) {
            
            return new BooleanWrapper(canControllerFdConfigurationRequirements.getTxBitRateSwitch());
            
        } else {
            return null;
        }
        
    }




    


    
}