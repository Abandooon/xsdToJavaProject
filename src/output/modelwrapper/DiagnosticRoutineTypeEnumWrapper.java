package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticRoutineTypeEnumWrapper {

    
    private DiagnosticRoutineTypeEnum diagnosticRoutineTypeEnum;

    public DiagnosticRoutineTypeEnumWrapper(DiagnosticRoutineTypeEnum diagnosticRoutineTypeEnum) {
        this.diagnosticRoutineTypeEnum = diagnosticRoutineTypeEnum;
    }

   
    public DiagnosticRoutineTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineTypeEnum.getValue())) {
            
            return diagnosticRoutineTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineTypeEnum.getS())) {
            
            return diagnosticRoutineTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineTypeEnum.getT())) {
            
            return diagnosticRoutineTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}