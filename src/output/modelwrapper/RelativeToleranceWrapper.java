package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class RelativeToleranceWrapper {

    
    private RelativeTolerance relativeTolerance;

    public RelativeToleranceWrapper(RelativeTolerance relativeTolerance) {
        this.relativeTolerance = relativeTolerance;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(relativeTolerance.getS())) {
            
            return relativeTolerance.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(relativeTolerance.getT())) {
            
            return relativeTolerance.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getRelative() {
        
        if (CollUtil.isNotEmpty(relativeTolerance.getRelative())) {
            
            return new IntegerWrapper(relativeTolerance.getRelative());
            
        } else {
            return null;
        }
        
    }




    


    
}