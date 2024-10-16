package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticExtendedDataRecordRefConditionalWrapper {

    
    private DiagnosticExtendedDataRecordRefConditional diagnosticExtendedDataRecordRefConditional;

    public DiagnosticExtendedDataRecordRefConditionalWrapper(DiagnosticExtendedDataRecordRefConditional diagnosticExtendedDataRecordRefConditional) {
        this.diagnosticExtendedDataRecordRefConditional = diagnosticExtendedDataRecordRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecordRefConditional.getS())) {
            
            return diagnosticExtendedDataRecordRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecordRefConditional.getT())) {
            
            return diagnosticExtendedDataRecordRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticExtendedDataRecordRefWrapper getDiagnosticExtendedDataRecordRef() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecordRefConditional.getDiagnosticExtendedDataRecordRef())) {
            
            return new DiagnosticExtendedDataRecordRefWrapper(diagnosticExtendedDataRecordRefConditional.getDiagnosticExtendedDataRecordRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecordRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticExtendedDataRecordRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}