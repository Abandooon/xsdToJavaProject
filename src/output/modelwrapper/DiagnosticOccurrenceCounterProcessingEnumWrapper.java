package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticOccurrenceCounterProcessingEnumWrapper {

    
    private DiagnosticOccurrenceCounterProcessingEnum diagnosticOccurrenceCounterProcessingEnum;

    public DiagnosticOccurrenceCounterProcessingEnumWrapper(DiagnosticOccurrenceCounterProcessingEnum diagnosticOccurrenceCounterProcessingEnum) {
        this.diagnosticOccurrenceCounterProcessingEnum = diagnosticOccurrenceCounterProcessingEnum;
    }

   
    public DiagnosticOccurrenceCounterProcessingEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticOccurrenceCounterProcessingEnum.getValue())) {
            
            return diagnosticOccurrenceCounterProcessingEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticOccurrenceCounterProcessingEnum.getS())) {
            
            return diagnosticOccurrenceCounterProcessingEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticOccurrenceCounterProcessingEnum.getT())) {
            
            return diagnosticOccurrenceCounterProcessingEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}