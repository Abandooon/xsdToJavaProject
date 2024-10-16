package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagEventDebounceAlgorithmWrapper {

    
    private DiagEventDebounceAlgorithm diagEventDebounceAlgorithm;

    public DiagEventDebounceAlgorithmWrapper(DiagEventDebounceAlgorithm diagEventDebounceAlgorithm) {
        this.diagEventDebounceAlgorithm = diagEventDebounceAlgorithm;
    }

   
    public DiagEventDebounceCounterBasedWrapper getDiagEventDebounceCounterBased() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceAlgorithm.getDiagEventDebounceCounterBased())) {
            
            return new DiagEventDebounceCounterBasedWrapper(diagEventDebounceAlgorithm.getDiagEventDebounceCounterBased());
            
        } else {
            return null;
        }
        
    }

    public DiagEventDebounceMonitorInternalWrapper getDiagEventDebounceMonitorInternal() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceAlgorithm.getDiagEventDebounceMonitorInternal())) {
            
            return new DiagEventDebounceMonitorInternalWrapper(diagEventDebounceAlgorithm.getDiagEventDebounceMonitorInternal());
            
        } else {
            return null;
        }
        
    }

    public DiagEventDebounceTimeBasedWrapper getDiagEventDebounceTimeBased() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceAlgorithm.getDiagEventDebounceTimeBased())) {
            
            return new DiagEventDebounceTimeBasedWrapper(diagEventDebounceAlgorithm.getDiagEventDebounceTimeBased());
            
        } else {
            return null;
        }
        
    }




    


    
}