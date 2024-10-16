package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticDataCaptureEnumWrapper {

    
    private DiagnosticDataCaptureEnum diagnosticDataCaptureEnum;

    public DiagnosticDataCaptureEnumWrapper(DiagnosticDataCaptureEnum diagnosticDataCaptureEnum) {
        this.diagnosticDataCaptureEnum = diagnosticDataCaptureEnum;
    }

   
    public DiagnosticDataCaptureEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticDataCaptureEnum.getValue())) {
            
            return diagnosticDataCaptureEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDataCaptureEnum.getS())) {
            
            return diagnosticDataCaptureEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDataCaptureEnum.getT())) {
            
            return diagnosticDataCaptureEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}