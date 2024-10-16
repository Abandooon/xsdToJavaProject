package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticRecordTriggerEnumWrapper {

    
    private DiagnosticRecordTriggerEnum diagnosticRecordTriggerEnum;

    public DiagnosticRecordTriggerEnumWrapper(DiagnosticRecordTriggerEnum diagnosticRecordTriggerEnum) {
        this.diagnosticRecordTriggerEnum = diagnosticRecordTriggerEnum;
    }

   
    public DiagnosticRecordTriggerEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticRecordTriggerEnum.getValue())) {
            
            return diagnosticRecordTriggerEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRecordTriggerEnum.getS())) {
            
            return diagnosticRecordTriggerEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRecordTriggerEnum.getT())) {
            
            return diagnosticRecordTriggerEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}