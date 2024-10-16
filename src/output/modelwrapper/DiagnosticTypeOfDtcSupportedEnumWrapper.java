package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticTypeOfDtcSupportedEnumWrapper {

    
    private DiagnosticTypeOfDtcSupportedEnum diagnosticTypeOfDtcSupportedEnum;

    public DiagnosticTypeOfDtcSupportedEnumWrapper(DiagnosticTypeOfDtcSupportedEnum diagnosticTypeOfDtcSupportedEnum) {
        this.diagnosticTypeOfDtcSupportedEnum = diagnosticTypeOfDtcSupportedEnum;
    }

   
    public DiagnosticTypeOfDtcSupportedEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticTypeOfDtcSupportedEnum.getValue())) {
            
            return diagnosticTypeOfDtcSupportedEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticTypeOfDtcSupportedEnum.getS())) {
            
            return diagnosticTypeOfDtcSupportedEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticTypeOfDtcSupportedEnum.getT())) {
            
            return diagnosticTypeOfDtcSupportedEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}