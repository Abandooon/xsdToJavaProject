package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticTroubleCodeRefConditionalWrapper {

    
    private DiagnosticTroubleCodeRefConditional diagnosticTroubleCodeRefConditional;

    public DiagnosticTroubleCodeRefConditionalWrapper(DiagnosticTroubleCodeRefConditional diagnosticTroubleCodeRefConditional) {
        this.diagnosticTroubleCodeRefConditional = diagnosticTroubleCodeRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeRefConditional.getS())) {
            
            return diagnosticTroubleCodeRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeRefConditional.getT())) {
            
            return diagnosticTroubleCodeRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticTroubleCodeRefWrapper getDiagnosticTroubleCodeRef() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeRefConditional.getDiagnosticTroubleCodeRef())) {
            
            return new DiagnosticTroubleCodeRefWrapper(diagnosticTroubleCodeRefConditional.getDiagnosticTroubleCodeRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticTroubleCodeRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}