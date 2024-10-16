package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticConnectedIndicatorBehaviorEnumWrapper {

    
    private DiagnosticConnectedIndicatorBehaviorEnum diagnosticConnectedIndicatorBehaviorEnum;

    public DiagnosticConnectedIndicatorBehaviorEnumWrapper(DiagnosticConnectedIndicatorBehaviorEnum diagnosticConnectedIndicatorBehaviorEnum) {
        this.diagnosticConnectedIndicatorBehaviorEnum = diagnosticConnectedIndicatorBehaviorEnum;
    }

   
    public DiagnosticConnectedIndicatorBehaviorEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicatorBehaviorEnum.getValue())) {
            
            return diagnosticConnectedIndicatorBehaviorEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicatorBehaviorEnum.getS())) {
            
            return diagnosticConnectedIndicatorBehaviorEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicatorBehaviorEnum.getT())) {
            
            return diagnosticConnectedIndicatorBehaviorEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}