package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticFreezeFrameRefConditionalWrapper {

    
    private DiagnosticFreezeFrameRefConditional diagnosticFreezeFrameRefConditional;

    public DiagnosticFreezeFrameRefConditionalWrapper(DiagnosticFreezeFrameRefConditional diagnosticFreezeFrameRefConditional) {
        this.diagnosticFreezeFrameRefConditional = diagnosticFreezeFrameRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrameRefConditional.getS())) {
            
            return diagnosticFreezeFrameRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrameRefConditional.getT())) {
            
            return diagnosticFreezeFrameRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticFreezeFrameRefWrapper getDiagnosticFreezeFrameRef() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrameRefConditional.getDiagnosticFreezeFrameRef())) {
            
            return new DiagnosticFreezeFrameRefWrapper(diagnosticFreezeFrameRefConditional.getDiagnosticFreezeFrameRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrameRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticFreezeFrameRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}