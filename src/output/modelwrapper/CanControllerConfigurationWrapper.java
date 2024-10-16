package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class CanControllerConfigurationWrapper {

    
    private CanControllerConfiguration canControllerConfiguration;

    public CanControllerConfigurationWrapper(CanControllerConfiguration canControllerConfiguration) {
        this.canControllerConfiguration = canControllerConfiguration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canControllerConfiguration.getS())) {
            
            return canControllerConfiguration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canControllerConfiguration.getT())) {
            
            return canControllerConfiguration.getT();
            
        } else {
            return null;
        }
        
    }

    public CanControllerFdConfigurationWrapper getCanControllerFdAttributes() {
        
        if (CollUtil.isNotEmpty(canControllerConfiguration.getCanControllerFdAttributes())) {
            
            return new CanControllerFdConfigurationWrapper(canControllerConfiguration.getCanControllerFdAttributes());
            
        } else {
            return null;
        }
        
    }

    public CanControllerFdConfigurationRequirementsWrapper getCanControllerFdRequirements() {
        
        if (CollUtil.isNotEmpty(canControllerConfiguration.getCanControllerFdRequirements())) {
            
            return new CanControllerFdConfigurationRequirementsWrapper(canControllerConfiguration.getCanControllerFdRequirements());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPropSeg() {
        
        if (CollUtil.isNotEmpty(canControllerConfiguration.getPropSeg())) {
            
            return new IntegerWrapper(canControllerConfiguration.getPropSeg());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSyncJumpWidth() {
        
        if (CollUtil.isNotEmpty(canControllerConfiguration.getSyncJumpWidth())) {
            
            return new IntegerWrapper(canControllerConfiguration.getSyncJumpWidth());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getTimeSeg1() {
        
        if (CollUtil.isNotEmpty(canControllerConfiguration.getTimeSeg1())) {
            
            return new IntegerWrapper(canControllerConfiguration.getTimeSeg1());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getTimeSeg2() {
        
        if (CollUtil.isNotEmpty(canControllerConfiguration.getTimeSeg2())) {
            
            return new IntegerWrapper(canControllerConfiguration.getTimeSeg2());
            
        } else {
            return null;
        }
        
    }




    


    
}