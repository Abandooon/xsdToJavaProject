package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class CanControllerFdConfigurationWrapper {

    
    private CanControllerFdConfiguration canControllerFdConfiguration;

    public CanControllerFdConfigurationWrapper(CanControllerFdConfiguration canControllerFdConfiguration) {
        this.canControllerFdConfiguration = canControllerFdConfiguration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfiguration.getS())) {
            
            return canControllerFdConfiguration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfiguration.getT())) {
            
            return canControllerFdConfiguration.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPaddingValue() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfiguration.getPaddingValue())) {
            
            return new PositiveIntegerWrapper(canControllerFdConfiguration.getPaddingValue());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPropSeg() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfiguration.getPropSeg())) {
            
            return new PositiveIntegerWrapper(canControllerFdConfiguration.getPropSeg());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSyncJumpWidth() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfiguration.getSyncJumpWidth())) {
            
            return new PositiveIntegerWrapper(canControllerFdConfiguration.getSyncJumpWidth());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getTimeSeg1() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfiguration.getTimeSeg1())) {
            
            return new PositiveIntegerWrapper(canControllerFdConfiguration.getTimeSeg1());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getTimeSeg2() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfiguration.getTimeSeg2())) {
            
            return new PositiveIntegerWrapper(canControllerFdConfiguration.getTimeSeg2());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTrcvDelayCompensationOffset() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfiguration.getTrcvDelayCompensationOffset())) {
            
            return new TimeValueWrapper(canControllerFdConfiguration.getTrcvDelayCompensationOffset());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getTxBitRateSwitch() {
        
        if (CollUtil.isNotEmpty(canControllerFdConfiguration.getTxBitRateSwitch())) {
            
            return new BooleanWrapper(canControllerFdConfiguration.getTxBitRateSwitch());
            
        } else {
            return null;
        }
        
    }




    


    
}