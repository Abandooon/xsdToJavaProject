package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticSignificanceEnumWrapper {

    
    private DiagnosticSignificanceEnum diagnosticSignificanceEnum;

    public DiagnosticSignificanceEnumWrapper(DiagnosticSignificanceEnum diagnosticSignificanceEnum) {
        this.diagnosticSignificanceEnum = diagnosticSignificanceEnum;
    }

   
    public DiagnosticSignificanceEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticSignificanceEnum.getValue())) {
            
            return diagnosticSignificanceEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticSignificanceEnum.getS())) {
            
            return diagnosticSignificanceEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticSignificanceEnum.getT())) {
            
            return diagnosticSignificanceEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}