package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticOperationCycleRefConditionalWrapper {

    
    private DiagnosticOperationCycleRefConditional diagnosticOperationCycleRefConditional;

    public DiagnosticOperationCycleRefConditionalWrapper(DiagnosticOperationCycleRefConditional diagnosticOperationCycleRefConditional) {
        this.diagnosticOperationCycleRefConditional = diagnosticOperationCycleRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleRefConditional.getS())) {
            
            return diagnosticOperationCycleRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleRefConditional.getT())) {
            
            return diagnosticOperationCycleRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticOperationCycleRefWrapper getDiagnosticOperationCycleRef() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleRefConditional.getDiagnosticOperationCycleRef())) {
            
            return new DiagnosticOperationCycleRefWrapper(diagnosticOperationCycleRefConditional.getDiagnosticOperationCycleRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticOperationCycleRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}