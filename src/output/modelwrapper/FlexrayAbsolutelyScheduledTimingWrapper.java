package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class FlexrayAbsolutelyScheduledTimingWrapper {

    
    private FlexrayAbsolutelyScheduledTiming flexrayAbsolutelyScheduledTiming;

    public FlexrayAbsolutelyScheduledTimingWrapper(FlexrayAbsolutelyScheduledTiming flexrayAbsolutelyScheduledTiming) {
        this.flexrayAbsolutelyScheduledTiming = flexrayAbsolutelyScheduledTiming;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayAbsolutelyScheduledTiming.getS())) {
            
            return flexrayAbsolutelyScheduledTiming.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayAbsolutelyScheduledTiming.getT())) {
            
            return flexrayAbsolutelyScheduledTiming.getT();
            
        } else {
            return null;
        }
        
    }

    public CommunicationCycleWrapper getCommunicationCycle() {
        
        if (CollUtil.isNotEmpty(flexrayAbsolutelyScheduledTiming.getCommunicationCycle())) {
            
            return new CommunicationCycleWrapper(flexrayAbsolutelyScheduledTiming.getCommunicationCycle());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSlotId() {
        
        if (CollUtil.isNotEmpty(flexrayAbsolutelyScheduledTiming.getSlotId())) {
            
            return new PositiveIntegerWrapper(flexrayAbsolutelyScheduledTiming.getSlotId());
            
        } else {
            return null;
        }
        
    }




    


    
}