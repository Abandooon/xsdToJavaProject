package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticClearEventBehaviorEnumWrapper {

    
    private DiagnosticClearEventBehaviorEnum diagnosticClearEventBehaviorEnum;

    public DiagnosticClearEventBehaviorEnumWrapper(DiagnosticClearEventBehaviorEnum diagnosticClearEventBehaviorEnum) {
        this.diagnosticClearEventBehaviorEnum = diagnosticClearEventBehaviorEnum;
    }

   
    public DiagnosticClearEventBehaviorEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticClearEventBehaviorEnum.getValue())) {
            
            return diagnosticClearEventBehaviorEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticClearEventBehaviorEnum.getS())) {
            
            return diagnosticClearEventBehaviorEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticClearEventBehaviorEnum.getT())) {
            
            return diagnosticClearEventBehaviorEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}