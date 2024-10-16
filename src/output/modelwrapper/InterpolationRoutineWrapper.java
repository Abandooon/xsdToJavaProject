package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class InterpolationRoutineWrapper {

    
    private InterpolationRoutine interpolationRoutine;

    public InterpolationRoutineWrapper(InterpolationRoutine interpolationRoutine) {
        this.interpolationRoutine = interpolationRoutine;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(interpolationRoutine.getS())) {
            
            return interpolationRoutine.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(interpolationRoutine.getT())) {
            
            return interpolationRoutine.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(interpolationRoutine.getShortLabel())) {
            
            return new IdentifierWrapper(interpolationRoutine.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsDefault() {
        
        if (CollUtil.isNotEmpty(interpolationRoutine.getIsDefault())) {
            
            return new BooleanWrapper(interpolationRoutine.getIsDefault());
            
        } else {
            return null;
        }
        
    }

    public InterpolationRoutineRefWrapper getInterpolationRoutineRef() {
        
        if (CollUtil.isNotEmpty(interpolationRoutine.getInterpolationRoutineRef())) {
            
            return new InterpolationRoutineRefWrapper(interpolationRoutine.getInterpolationRoutineRef());
            
        } else {
            return null;
        }
        
    }




    


    
}