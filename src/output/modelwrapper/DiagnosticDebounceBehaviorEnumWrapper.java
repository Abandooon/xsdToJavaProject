package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticDebounceBehaviorEnumWrapper {

    
    private DiagnosticDebounceBehaviorEnum diagnosticDebounceBehaviorEnum;

    public DiagnosticDebounceBehaviorEnumWrapper(DiagnosticDebounceBehaviorEnum diagnosticDebounceBehaviorEnum) {
        this.diagnosticDebounceBehaviorEnum = diagnosticDebounceBehaviorEnum;
    }

   
    public DiagnosticDebounceBehaviorEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticDebounceBehaviorEnum.getValue())) {
            
            return diagnosticDebounceBehaviorEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDebounceBehaviorEnum.getS())) {
            
            return diagnosticDebounceBehaviorEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDebounceBehaviorEnum.getT())) {
            
            return diagnosticDebounceBehaviorEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}