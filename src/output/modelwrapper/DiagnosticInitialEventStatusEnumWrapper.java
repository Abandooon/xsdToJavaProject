package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticInitialEventStatusEnumWrapper {

    
    private DiagnosticInitialEventStatusEnum diagnosticInitialEventStatusEnum;

    public DiagnosticInitialEventStatusEnumWrapper(DiagnosticInitialEventStatusEnum diagnosticInitialEventStatusEnum) {
        this.diagnosticInitialEventStatusEnum = diagnosticInitialEventStatusEnum;
    }

   
    public DiagnosticInitialEventStatusEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticInitialEventStatusEnum.getValue())) {
            
            return diagnosticInitialEventStatusEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticInitialEventStatusEnum.getS())) {
            
            return diagnosticInitialEventStatusEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticInitialEventStatusEnum.getT())) {
            
            return diagnosticInitialEventStatusEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}