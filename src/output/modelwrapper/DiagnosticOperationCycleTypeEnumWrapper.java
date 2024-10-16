package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticOperationCycleTypeEnumWrapper {

    
    private DiagnosticOperationCycleTypeEnum diagnosticOperationCycleTypeEnum;

    public DiagnosticOperationCycleTypeEnumWrapper(DiagnosticOperationCycleTypeEnum diagnosticOperationCycleTypeEnum) {
        this.diagnosticOperationCycleTypeEnum = diagnosticOperationCycleTypeEnum;
    }

   
    public DiagnosticOperationCycleTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleTypeEnum.getValue())) {
            
            return diagnosticOperationCycleTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleTypeEnum.getS())) {
            
            return diagnosticOperationCycleTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleTypeEnum.getT())) {
            
            return diagnosticOperationCycleTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}