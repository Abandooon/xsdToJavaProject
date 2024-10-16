package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticIndicatorTypeEnumWrapper {

    
    private DiagnosticIndicatorTypeEnum diagnosticIndicatorTypeEnum;

    public DiagnosticIndicatorTypeEnumWrapper(DiagnosticIndicatorTypeEnum diagnosticIndicatorTypeEnum) {
        this.diagnosticIndicatorTypeEnum = diagnosticIndicatorTypeEnum;
    }

   
    public DiagnosticIndicatorTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicatorTypeEnum.getValue())) {
            
            return diagnosticIndicatorTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicatorTypeEnum.getS())) {
            
            return diagnosticIndicatorTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicatorTypeEnum.getT())) {
            
            return diagnosticIndicatorTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}