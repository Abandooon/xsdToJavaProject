package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticAccessPermissionValidityEnumWrapper {

    
    private DiagnosticAccessPermissionValidityEnum diagnosticAccessPermissionValidityEnum;

    public DiagnosticAccessPermissionValidityEnumWrapper(DiagnosticAccessPermissionValidityEnum diagnosticAccessPermissionValidityEnum) {
        this.diagnosticAccessPermissionValidityEnum = diagnosticAccessPermissionValidityEnum;
    }

   
    public DiagnosticAccessPermissionValidityEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermissionValidityEnum.getValue())) {
            
            return diagnosticAccessPermissionValidityEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermissionValidityEnum.getS())) {
            
            return diagnosticAccessPermissionValidityEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermissionValidityEnum.getT())) {
            
            return diagnosticAccessPermissionValidityEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}