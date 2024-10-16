package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticDataChangeTriggerWrapper {

    
    private DiagnosticDataChangeTrigger diagnosticDataChangeTrigger;

    public DiagnosticDataChangeTriggerWrapper(DiagnosticDataChangeTrigger diagnosticDataChangeTrigger) {
        this.diagnosticDataChangeTrigger = diagnosticDataChangeTrigger;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDataChangeTrigger.getS())) {
            
            return diagnosticDataChangeTrigger.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDataChangeTrigger.getT())) {
            
            return diagnosticDataChangeTrigger.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticInitialEventStatusEnumWrapper getInitialEventStatus() {
        
        if (CollUtil.isNotEmpty(diagnosticDataChangeTrigger.getInitialEventStatus())) {
            
            return new DiagnosticInitialEventStatusEnumWrapper(diagnosticDataChangeTrigger.getInitialEventStatus());
            
        } else {
            return null;
        }
        
    }

    public DataIdentifierRefWrapper getDataIdentifierRef() {
        
        if (CollUtil.isNotEmpty(diagnosticDataChangeTrigger.getDataIdentifierRef())) {
            
            return new DataIdentifierRefWrapper(diagnosticDataChangeTrigger.getDataIdentifierRef());
            
        } else {
            return null;
        }
        
    }




    


    
}