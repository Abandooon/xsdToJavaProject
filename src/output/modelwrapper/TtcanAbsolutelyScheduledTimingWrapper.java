package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class TtcanAbsolutelyScheduledTimingWrapper {

    
    private TtcanAbsolutelyScheduledTiming ttcanAbsolutelyScheduledTiming;

    public TtcanAbsolutelyScheduledTimingWrapper(TtcanAbsolutelyScheduledTiming ttcanAbsolutelyScheduledTiming) {
        this.ttcanAbsolutelyScheduledTiming = ttcanAbsolutelyScheduledTiming;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ttcanAbsolutelyScheduledTiming.getS())) {
            
            return ttcanAbsolutelyScheduledTiming.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ttcanAbsolutelyScheduledTiming.getT())) {
            
            return ttcanAbsolutelyScheduledTiming.getT();
            
        } else {
            return null;
        }
        
    }

    public CommunicationCycleWrapper getCommunicationCycle() {
        
        if (CollUtil.isNotEmpty(ttcanAbsolutelyScheduledTiming.getCommunicationCycle())) {
            
            return new CommunicationCycleWrapper(ttcanAbsolutelyScheduledTiming.getCommunicationCycle());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getTimeMark() {
        
        if (CollUtil.isNotEmpty(ttcanAbsolutelyScheduledTiming.getTimeMark())) {
            
            return new IntegerWrapper(ttcanAbsolutelyScheduledTiming.getTimeMark());
            
        } else {
            return null;
        }
        
    }

    public TtcanTriggerTypeWrapper getTrigger() {
        
        if (CollUtil.isNotEmpty(ttcanAbsolutelyScheduledTiming.getTrigger())) {
            
            return new TtcanTriggerTypeWrapper(ttcanAbsolutelyScheduledTiming.getTrigger());
            
        } else {
            return null;
        }
        
    }




    


    
}