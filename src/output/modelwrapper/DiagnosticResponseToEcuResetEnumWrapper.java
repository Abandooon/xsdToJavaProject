package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticResponseToEcuResetEnumWrapper {

    
    private DiagnosticResponseToEcuResetEnum diagnosticResponseToEcuResetEnum;

    public DiagnosticResponseToEcuResetEnumWrapper(DiagnosticResponseToEcuResetEnum diagnosticResponseToEcuResetEnum) {
        this.diagnosticResponseToEcuResetEnum = diagnosticResponseToEcuResetEnum;
    }

   
    public DiagnosticResponseToEcuResetEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseToEcuResetEnum.getValue())) {
            
            return diagnosticResponseToEcuResetEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseToEcuResetEnum.getS())) {
            
            return diagnosticResponseToEcuResetEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseToEcuResetEnum.getT())) {
            
            return diagnosticResponseToEcuResetEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}