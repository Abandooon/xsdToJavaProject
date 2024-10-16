package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticCommonElementRefConditionalWrapper {

    
    private DiagnosticCommonElementRefConditional diagnosticCommonElementRefConditional;

    public DiagnosticCommonElementRefConditionalWrapper(DiagnosticCommonElementRefConditional diagnosticCommonElementRefConditional) {
        this.diagnosticCommonElementRefConditional = diagnosticCommonElementRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonElementRefConditional.getS())) {
            
            return diagnosticCommonElementRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonElementRefConditional.getT())) {
            
            return diagnosticCommonElementRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticCommonElementRefWrapper getDiagnosticCommonElementRef() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonElementRefConditional.getDiagnosticCommonElementRef())) {
            
            return new DiagnosticCommonElementRefWrapper(diagnosticCommonElementRefConditional.getDiagnosticCommonElementRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonElementRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticCommonElementRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}