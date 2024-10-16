package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticEventWindowTimeEnumWrapper {

    
    private DiagnosticEventWindowTimeEnum diagnosticEventWindowTimeEnum;

    public DiagnosticEventWindowTimeEnumWrapper(DiagnosticEventWindowTimeEnum diagnosticEventWindowTimeEnum) {
        this.diagnosticEventWindowTimeEnum = diagnosticEventWindowTimeEnum;
    }

   
    public DiagnosticEventWindowTimeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticEventWindowTimeEnum.getValue())) {
            
            return diagnosticEventWindowTimeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventWindowTimeEnum.getS())) {
            
            return diagnosticEventWindowTimeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventWindowTimeEnum.getT())) {
            
            return diagnosticEventWindowTimeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}