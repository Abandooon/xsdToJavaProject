package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticAudienceEnumWrapper {

    
    private DiagnosticAudienceEnum diagnosticAudienceEnum;

    public DiagnosticAudienceEnumWrapper(DiagnosticAudienceEnum diagnosticAudienceEnum) {
        this.diagnosticAudienceEnum = diagnosticAudienceEnum;
    }

   
    public DiagnosticAudienceEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticAudienceEnum.getValue())) {
            
            return diagnosticAudienceEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticAudienceEnum.getS())) {
            
            return diagnosticAudienceEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticAudienceEnum.getT())) {
            
            return diagnosticAudienceEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}