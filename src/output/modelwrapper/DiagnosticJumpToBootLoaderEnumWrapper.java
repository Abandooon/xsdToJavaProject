package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticJumpToBootLoaderEnumWrapper {

    
    private DiagnosticJumpToBootLoaderEnum diagnosticJumpToBootLoaderEnum;

    public DiagnosticJumpToBootLoaderEnumWrapper(DiagnosticJumpToBootLoaderEnum diagnosticJumpToBootLoaderEnum) {
        this.diagnosticJumpToBootLoaderEnum = diagnosticJumpToBootLoaderEnum;
    }

   
    public DiagnosticJumpToBootLoaderEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticJumpToBootLoaderEnum.getValue())) {
            
            return diagnosticJumpToBootLoaderEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticJumpToBootLoaderEnum.getS())) {
            
            return diagnosticJumpToBootLoaderEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticJumpToBootLoaderEnum.getT())) {
            
            return diagnosticJumpToBootLoaderEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}