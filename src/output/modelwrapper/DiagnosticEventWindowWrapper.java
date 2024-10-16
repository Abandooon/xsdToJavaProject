package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticEventWindowWrapper {

    
    private DiagnosticEventWindow diagnosticEventWindow;

    public DiagnosticEventWindowWrapper(DiagnosticEventWindow diagnosticEventWindow) {
        this.diagnosticEventWindow = diagnosticEventWindow;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventWindow.getS())) {
            
            return diagnosticEventWindow.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventWindow.getT())) {
            
            return diagnosticEventWindow.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventWindowTimeEnumWrapper getEventWindowTime() {
        
        if (CollUtil.isNotEmpty(diagnosticEventWindow.getEventWindowTime())) {
            
            return new DiagnosticEventWindowTimeEnumWrapper(diagnosticEventWindow.getEventWindowTime());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getStorageStateEvaluation() {
        
        if (CollUtil.isNotEmpty(diagnosticEventWindow.getStorageStateEvaluation())) {
            
            return new BooleanWrapper(diagnosticEventWindow.getStorageStateEvaluation());
            
        } else {
            return null;
        }
        
    }




    


    
}