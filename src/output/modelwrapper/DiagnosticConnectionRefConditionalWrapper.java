package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticConnectionRefConditionalWrapper {

    
    private DiagnosticConnectionRefConditional diagnosticConnectionRefConditional;

    public DiagnosticConnectionRefConditionalWrapper(DiagnosticConnectionRefConditional diagnosticConnectionRefConditional) {
        this.diagnosticConnectionRefConditional = diagnosticConnectionRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectionRefConditional.getS())) {
            
            return diagnosticConnectionRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectionRefConditional.getT())) {
            
            return diagnosticConnectionRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticConnectionRefWrapper getDiagnosticConnectionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectionRefConditional.getDiagnosticConnectionRef())) {
            
            return new DiagnosticConnectionRefWrapper(diagnosticConnectionRefConditional.getDiagnosticConnectionRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectionRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticConnectionRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}