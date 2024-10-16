package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticEventKindEnumWrapper {

    
    private DiagnosticEventKindEnum diagnosticEventKindEnum;

    public DiagnosticEventKindEnumWrapper(DiagnosticEventKindEnum diagnosticEventKindEnum) {
        this.diagnosticEventKindEnum = diagnosticEventKindEnum;
    }

   
    public DiagnosticEventKindEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticEventKindEnum.getValue())) {
            
            return diagnosticEventKindEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventKindEnum.getS())) {
            
            return diagnosticEventKindEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventKindEnum.getT())) {
            
            return diagnosticEventKindEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}