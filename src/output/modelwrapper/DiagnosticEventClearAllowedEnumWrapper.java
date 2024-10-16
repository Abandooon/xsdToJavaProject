package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticEventClearAllowedEnumWrapper {

    
    private DiagnosticEventClearAllowedEnum diagnosticEventClearAllowedEnum;

    public DiagnosticEventClearAllowedEnumWrapper(DiagnosticEventClearAllowedEnum diagnosticEventClearAllowedEnum) {
        this.diagnosticEventClearAllowedEnum = diagnosticEventClearAllowedEnum;
    }

   
    public DiagnosticEventClearAllowedEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticEventClearAllowedEnum.getValue())) {
            
            return diagnosticEventClearAllowedEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventClearAllowedEnum.getS())) {
            
            return diagnosticEventClearAllowedEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventClearAllowedEnum.getT())) {
            
            return diagnosticEventClearAllowedEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}