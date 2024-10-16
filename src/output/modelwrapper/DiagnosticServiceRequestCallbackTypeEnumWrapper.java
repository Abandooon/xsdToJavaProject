package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticServiceRequestCallbackTypeEnumWrapper {

    
    private DiagnosticServiceRequestCallbackTypeEnum diagnosticServiceRequestCallbackTypeEnum;

    public DiagnosticServiceRequestCallbackTypeEnumWrapper(DiagnosticServiceRequestCallbackTypeEnum diagnosticServiceRequestCallbackTypeEnum) {
        this.diagnosticServiceRequestCallbackTypeEnum = diagnosticServiceRequestCallbackTypeEnum;
    }

   
    public DiagnosticServiceRequestCallbackTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceRequestCallbackTypeEnum.getValue())) {
            
            return diagnosticServiceRequestCallbackTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceRequestCallbackTypeEnum.getS())) {
            
            return diagnosticServiceRequestCallbackTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceRequestCallbackTypeEnum.getT())) {
            
            return diagnosticServiceRequestCallbackTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}