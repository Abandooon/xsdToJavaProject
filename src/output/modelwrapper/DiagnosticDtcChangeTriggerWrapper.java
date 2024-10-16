package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticDtcChangeTriggerWrapper {

    
    private DiagnosticDtcChangeTrigger diagnosticDtcChangeTrigger;

    public DiagnosticDtcChangeTriggerWrapper(DiagnosticDtcChangeTrigger diagnosticDtcChangeTrigger) {
        this.diagnosticDtcChangeTrigger = diagnosticDtcChangeTrigger;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDtcChangeTrigger.getS())) {
            
            return diagnosticDtcChangeTrigger.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDtcChangeTrigger.getT())) {
            
            return diagnosticDtcChangeTrigger.getT();
            
        } else {
            return null;
        }
        
    }

    public DiagnosticInitialEventStatusEnumWrapper getInitialEventStatus() {
        
        if (CollUtil.isNotEmpty(diagnosticDtcChangeTrigger.getInitialEventStatus())) {
            
            return new DiagnosticInitialEventStatusEnumWrapper(diagnosticDtcChangeTrigger.getInitialEventStatus());
            
        } else {
            return null;
        }
        
    }




    


    
}