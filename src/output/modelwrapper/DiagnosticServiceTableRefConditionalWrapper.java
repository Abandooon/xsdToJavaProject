package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticServiceTableRefConditionalWrapper {

    
    private DiagnosticServiceTableRefConditional diagnosticServiceTableRefConditional;

    public DiagnosticServiceTableRefConditionalWrapper(DiagnosticServiceTableRefConditional diagnosticServiceTableRefConditional) {
        this.diagnosticServiceTableRefConditional = diagnosticServiceTableRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTableRefConditional.getS())) {
            
            return diagnosticServiceTableRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTableRefConditional.getT())) {
            
            return diagnosticServiceTableRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticServiceTableRefWrapper getDiagnosticServiceTableRef() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTableRefConditional.getDiagnosticServiceTableRef())) {
            
            return new DiagnosticServiceTableRefWrapper(diagnosticServiceTableRefConditional.getDiagnosticServiceTableRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTableRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticServiceTableRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}