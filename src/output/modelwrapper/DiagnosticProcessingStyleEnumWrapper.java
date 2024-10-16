package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticProcessingStyleEnumWrapper {

    
    private DiagnosticProcessingStyleEnum diagnosticProcessingStyleEnum;

    public DiagnosticProcessingStyleEnumWrapper(DiagnosticProcessingStyleEnum diagnosticProcessingStyleEnum) {
        this.diagnosticProcessingStyleEnum = diagnosticProcessingStyleEnum;
    }

   
    public DiagnosticProcessingStyleEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticProcessingStyleEnum.getValue())) {
            
            return diagnosticProcessingStyleEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticProcessingStyleEnum.getS())) {
            
            return diagnosticProcessingStyleEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticProcessingStyleEnum.getT())) {
            
            return diagnosticProcessingStyleEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}