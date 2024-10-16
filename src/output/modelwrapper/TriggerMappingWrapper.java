package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TriggerMappingWrapper {

    
    private TriggerMapping triggerMapping;

    public TriggerMappingWrapper(TriggerMapping triggerMapping) {
        this.triggerMapping = triggerMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(triggerMapping.getS())) {
            
            return triggerMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(triggerMapping.getT())) {
            
            return triggerMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public FirstTriggerRefWrapper getFirstTriggerRef() {
        
        if (CollUtil.isNotEmpty(triggerMapping.getFirstTriggerRef())) {
            
            return new FirstTriggerRefWrapper(triggerMapping.getFirstTriggerRef());
            
        } else {
            return null;
        }
        
    }

    public SecondTriggerRefWrapper getSecondTriggerRef() {
        
        if (CollUtil.isNotEmpty(triggerMapping.getSecondTriggerRef())) {
            
            return new SecondTriggerRefWrapper(triggerMapping.getSecondTriggerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}