package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticHandleDddiConfigurationEnumWrapper {

    
    private DiagnosticHandleDddiConfigurationEnum diagnosticHandleDddiConfigurationEnum;

    public DiagnosticHandleDddiConfigurationEnumWrapper(DiagnosticHandleDddiConfigurationEnum diagnosticHandleDddiConfigurationEnum) {
        this.diagnosticHandleDddiConfigurationEnum = diagnosticHandleDddiConfigurationEnum;
    }

   
    public DiagnosticHandleDddiConfigurationEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticHandleDddiConfigurationEnum.getValue())) {
            
            return diagnosticHandleDddiConfigurationEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticHandleDddiConfigurationEnum.getS())) {
            
            return diagnosticHandleDddiConfigurationEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticHandleDddiConfigurationEnum.getT())) {
            
            return diagnosticHandleDddiConfigurationEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}