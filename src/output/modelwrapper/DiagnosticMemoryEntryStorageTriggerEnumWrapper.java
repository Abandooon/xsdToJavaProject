package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticMemoryEntryStorageTriggerEnumWrapper {

    
    private DiagnosticMemoryEntryStorageTriggerEnum diagnosticMemoryEntryStorageTriggerEnum;

    public DiagnosticMemoryEntryStorageTriggerEnumWrapper(DiagnosticMemoryEntryStorageTriggerEnum diagnosticMemoryEntryStorageTriggerEnum) {
        this.diagnosticMemoryEntryStorageTriggerEnum = diagnosticMemoryEntryStorageTriggerEnum;
    }

   
    public DiagnosticMemoryEntryStorageTriggerEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryEntryStorageTriggerEnum.getValue())) {
            
            return diagnosticMemoryEntryStorageTriggerEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryEntryStorageTriggerEnum.getS())) {
            
            return diagnosticMemoryEntryStorageTriggerEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryEntryStorageTriggerEnum.getT())) {
            
            return diagnosticMemoryEntryStorageTriggerEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}