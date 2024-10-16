package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class AbsoluteToleranceWrapper {

    
    private AbsoluteTolerance absoluteTolerance;

    public AbsoluteToleranceWrapper(AbsoluteTolerance absoluteTolerance) {
        this.absoluteTolerance = absoluteTolerance;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(absoluteTolerance.getS())) {
            
            return absoluteTolerance.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(absoluteTolerance.getT())) {
            
            return absoluteTolerance.getT();
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getAbsolute() {
        
        if (CollUtil.isNotEmpty(absoluteTolerance.getAbsolute())) {
            
            return new TimeValueWrapper(absoluteTolerance.getAbsolute());
            
        } else {
            return null;
        }
        
    }




    


    
}