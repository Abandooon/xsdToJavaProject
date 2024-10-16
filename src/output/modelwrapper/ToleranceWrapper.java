package stdgui.data.model.modelwrapper;


    
    

    
    


public class ToleranceWrapper {

    
    private Tolerance tolerance;

    public ToleranceWrapper(Tolerance tolerance) {
        this.tolerance = tolerance;
    }

   
    public AbsoluteToleranceWrapper getAbsoluteTolerance() {
        
        if (CollUtil.isNotEmpty(tolerance.getAbsoluteTolerance())) {
            
            return new AbsoluteToleranceWrapper(tolerance.getAbsoluteTolerance());
            
        } else {
            return null;
        }
        
    }

    public RelativeToleranceWrapper getRelativeTolerance() {
        
        if (CollUtil.isNotEmpty(tolerance.getRelativeTolerance())) {
            
            return new RelativeToleranceWrapper(tolerance.getRelativeTolerance());
            
        } else {
            return null;
        }
        
    }




    


    
}