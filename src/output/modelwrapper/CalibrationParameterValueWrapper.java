package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class CalibrationParameterValueWrapper {

    
    private CalibrationParameterValue calibrationParameterValue;

    public CalibrationParameterValueWrapper(CalibrationParameterValue calibrationParameterValue) {
        this.calibrationParameterValue = calibrationParameterValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValue.getS())) {
            
            return calibrationParameterValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValue.getT())) {
            
            return calibrationParameterValue.getT();
            
        } else {
            return null;
        }
        
    }

    public ApplInitValueWrapper getApplInitValue() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValue.getApplInitValue())) {
            
            return new ApplInitValueWrapper(calibrationParameterValue.getApplInitValue());
            
        } else {
            return null;
        }
        
    }

    public ImplInitValueWrapper getImplInitValue() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValue.getImplInitValue())) {
            
            return new ImplInitValueWrapper(calibrationParameterValue.getImplInitValue());
            
        } else {
            return null;
        }
        
    }

    public InitializedParameterRefWrapper getInitializedParameterRef() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValue.getInitializedParameterRef())) {
            
            return new InitializedParameterRefWrapper(calibrationParameterValue.getInitializedParameterRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValue.getVariationPoint())) {
            
            return new VariationPointWrapper(calibrationParameterValue.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}