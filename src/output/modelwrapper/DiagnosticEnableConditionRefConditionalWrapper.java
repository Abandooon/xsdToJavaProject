package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticEnableConditionRefConditionalWrapper {

    
    private DiagnosticEnableConditionRefConditional diagnosticEnableConditionRefConditional;

    public DiagnosticEnableConditionRefConditionalWrapper(DiagnosticEnableConditionRefConditional diagnosticEnableConditionRefConditional) {
        this.diagnosticEnableConditionRefConditional = diagnosticEnableConditionRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionRefConditional.getS())) {
            
            return diagnosticEnableConditionRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionRefConditional.getT())) {
            
            return diagnosticEnableConditionRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEnableConditionRefWrapper getDiagnosticEnableConditionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionRefConditional.getDiagnosticEnableConditionRef())) {
            
            return new DiagnosticEnableConditionRefWrapper(diagnosticEnableConditionRefConditional.getDiagnosticEnableConditionRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEnableConditionRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}