package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticClearDtcLimitationEnumWrapper {

    
    private DiagnosticClearDtcLimitationEnum diagnosticClearDtcLimitationEnum;

    public DiagnosticClearDtcLimitationEnumWrapper(DiagnosticClearDtcLimitationEnum diagnosticClearDtcLimitationEnum) {
        this.diagnosticClearDtcLimitationEnum = diagnosticClearDtcLimitationEnum;
    }

   
    public DiagnosticClearDtcLimitationEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDtcLimitationEnum.getValue())) {
            
            return diagnosticClearDtcLimitationEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDtcLimitationEnum.getS())) {
            
            return diagnosticClearDtcLimitationEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDtcLimitationEnum.getT())) {
            
            return diagnosticClearDtcLimitationEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}