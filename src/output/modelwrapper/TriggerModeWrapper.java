package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TriggerModeWrapper {

    
    private TriggerMode triggerMode;

    public TriggerModeWrapper(TriggerMode triggerMode) {
        this.triggerMode = triggerMode;
    }

   
    public TriggerModeSimple getValue() {
        
        if (CollUtil.isNotEmpty(triggerMode.getValue())) {
            
            return triggerMode.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(triggerMode.getS())) {
            
            return triggerMode.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(triggerMode.getT())) {
            
            return triggerMode.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}