package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticStorageConditionRefConditionalWrapper {

    
    private DiagnosticStorageConditionRefConditional diagnosticStorageConditionRefConditional;

    public DiagnosticStorageConditionRefConditionalWrapper(DiagnosticStorageConditionRefConditional diagnosticStorageConditionRefConditional) {
        this.diagnosticStorageConditionRefConditional = diagnosticStorageConditionRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionRefConditional.getS())) {
            
            return diagnosticStorageConditionRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionRefConditional.getT())) {
            
            return diagnosticStorageConditionRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticStorageConditionRefWrapper getDiagnosticStorageConditionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionRefConditional.getDiagnosticStorageConditionRef())) {
            
            return new DiagnosticStorageConditionRefWrapper(diagnosticStorageConditionRefConditional.getDiagnosticStorageConditionRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticStorageConditionRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}