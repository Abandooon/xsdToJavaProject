package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    


public class ConfidenceIntervalWrapper {

    
    private ConfidenceInterval confidenceInterval;

    public ConfidenceIntervalWrapper(ConfidenceInterval confidenceInterval) {
        this.confidenceInterval = confidenceInterval;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(confidenceInterval.getS())) {
            
            return confidenceInterval.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(confidenceInterval.getT())) {
            
            return confidenceInterval.getT();
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getLowerBound() {
        
        if (CollUtil.isNotEmpty(confidenceInterval.getLowerBound())) {
            
            return new MultidimensionalTimeWrapper(confidenceInterval.getLowerBound());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getPropability() {
        
        if (CollUtil.isNotEmpty(confidenceInterval.getPropability())) {
            
            return new FloatWrapper(confidenceInterval.getPropability());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getUpperBound() {
        
        if (CollUtil.isNotEmpty(confidenceInterval.getUpperBound())) {
            
            return new MultidimensionalTimeWrapper(confidenceInterval.getUpperBound());
            
        } else {
            return null;
        }
        
    }




    


    
}