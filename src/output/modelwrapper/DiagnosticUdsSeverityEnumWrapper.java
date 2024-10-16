package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticUdsSeverityEnumWrapper {

    
    private DiagnosticUdsSeverityEnum diagnosticUdsSeverityEnum;

    public DiagnosticUdsSeverityEnumWrapper(DiagnosticUdsSeverityEnum diagnosticUdsSeverityEnum) {
        this.diagnosticUdsSeverityEnum = diagnosticUdsSeverityEnum;
    }

   
    public DiagnosticUdsSeverityEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticUdsSeverityEnum.getValue())) {
            
            return diagnosticUdsSeverityEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticUdsSeverityEnum.getS())) {
            
            return diagnosticUdsSeverityEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticUdsSeverityEnum.getT())) {
            
            return diagnosticUdsSeverityEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}