package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticValueAccessEnumWrapper {

    
    private DiagnosticValueAccessEnum diagnosticValueAccessEnum;

    public DiagnosticValueAccessEnumWrapper(DiagnosticValueAccessEnum diagnosticValueAccessEnum) {
        this.diagnosticValueAccessEnum = diagnosticValueAccessEnum;
    }

   
    public DiagnosticValueAccessEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticValueAccessEnum.getValue())) {
            
            return diagnosticValueAccessEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticValueAccessEnum.getS())) {
            
            return diagnosticValueAccessEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticValueAccessEnum.getT())) {
            
            return diagnosticValueAccessEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}