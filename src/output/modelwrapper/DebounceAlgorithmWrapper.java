package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DebounceAlgorithmWrapper {

    
    private DebounceAlgorithm debounceAlgorithm;

    public DebounceAlgorithmWrapper(DebounceAlgorithm debounceAlgorithm) {
        this.debounceAlgorithm = debounceAlgorithm;
    }

   
    public DiagEventDebounceCounterBasedWrapper getDiagEventDebounceCounterBased() {
        
        if (CollUtil.isNotEmpty(debounceAlgorithm.getDiagEventDebounceCounterBased())) {
            
            return new DiagEventDebounceCounterBasedWrapper(debounceAlgorithm.getDiagEventDebounceCounterBased());
            
        } else {
            return null;
        }
        
    }

    public DiagEventDebounceMonitorInternalWrapper getDiagEventDebounceMonitorInternal() {
        
        if (CollUtil.isNotEmpty(debounceAlgorithm.getDiagEventDebounceMonitorInternal())) {
            
            return new DiagEventDebounceMonitorInternalWrapper(debounceAlgorithm.getDiagEventDebounceMonitorInternal());
            
        } else {
            return null;
        }
        
    }

    public DiagEventDebounceTimeBasedWrapper getDiagEventDebounceTimeBased() {
        
        if (CollUtil.isNotEmpty(debounceAlgorithm.getDiagEventDebounceTimeBased())) {
            
            return new DiagEventDebounceTimeBasedWrapper(debounceAlgorithm.getDiagEventDebounceTimeBased());
            
        } else {
            return null;
        }
        
    }




    


    
}