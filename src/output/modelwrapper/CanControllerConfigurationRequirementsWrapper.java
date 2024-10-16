package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    
        import stdgui.data.model.orimodel.Float;
    


public class CanControllerConfigurationRequirementsWrapper {

    
    private CanControllerConfigurationRequirements canControllerConfigurationRequirements;

    public CanControllerConfigurationRequirementsWrapper(CanControllerConfigurationRequirements canControllerConfigurationRequirements) {
        this.canControllerConfigurationRequirements = canControllerConfigurationRequirements;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canControllerConfigurationRequirements.getS())) {
            
            return canControllerConfigurationRequirements.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canControllerConfigurationRequirements.getT())) {
            
            return canControllerConfigurationRequirements.getT();
            
        } else {
            return null;
        }
        
    }

    public CanControllerFdConfigurationWrapper getCanControllerFdAttributes() {
        
        if (CollUtil.isNotEmpty(canControllerConfigurationRequirements.getCanControllerFdAttributes())) {
            
            return new CanControllerFdConfigurationWrapper(canControllerConfigurationRequirements.getCanControllerFdAttributes());
            
        } else {
            return null;
        }
        
    }

    public CanControllerFdConfigurationRequirementsWrapper getCanControllerFdRequirements() {
        
        if (CollUtil.isNotEmpty(canControllerConfigurationRequirements.getCanControllerFdRequirements())) {
            
            return new CanControllerFdConfigurationRequirementsWrapper(canControllerConfigurationRequirements.getCanControllerFdRequirements());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxNumberOfTimeQuantaPerBit() {
        
        if (CollUtil.isNotEmpty(canControllerConfigurationRequirements.getMaxNumberOfTimeQuantaPerBit())) {
            
            return new IntegerWrapper(canControllerConfigurationRequirements.getMaxNumberOfTimeQuantaPerBit());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getMaxSamplePoint() {
        
        if (CollUtil.isNotEmpty(canControllerConfigurationRequirements.getMaxSamplePoint())) {
            
            return new FloatWrapper(canControllerConfigurationRequirements.getMaxSamplePoint());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getMaxSyncJumpWidth() {
        
        if (CollUtil.isNotEmpty(canControllerConfigurationRequirements.getMaxSyncJumpWidth())) {
            
            return new FloatWrapper(canControllerConfigurationRequirements.getMaxSyncJumpWidth());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMinNumberOfTimeQuantaPerBit() {
        
        if (CollUtil.isNotEmpty(canControllerConfigurationRequirements.getMinNumberOfTimeQuantaPerBit())) {
            
            return new IntegerWrapper(canControllerConfigurationRequirements.getMinNumberOfTimeQuantaPerBit());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getMinSamplePoint() {
        
        if (CollUtil.isNotEmpty(canControllerConfigurationRequirements.getMinSamplePoint())) {
            
            return new FloatWrapper(canControllerConfigurationRequirements.getMinSamplePoint());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getMinSyncJumpWidth() {
        
        if (CollUtil.isNotEmpty(canControllerConfigurationRequirements.getMinSyncJumpWidth())) {
            
            return new FloatWrapper(canControllerConfigurationRequirements.getMinSyncJumpWidth());
            
        } else {
            return null;
        }
        
    }




    


    
}