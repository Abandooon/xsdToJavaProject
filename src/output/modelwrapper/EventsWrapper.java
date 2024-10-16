package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EventsWrapper {

    
    private Events events;

    public EventsWrapper(Events events) {
        this.events = events;
    }

   
    public ArrayList<BswAsynchronousServerCallReturnsEventWrapper> getBswAsynchronousServerCallReturnsEvent() {
        
        if (CollUtil.isNotEmpty(events.getBswAsynchronousServerCallReturnsEvent())) {
            ArrayList<BswAsynchronousServerCallReturnsEvent> originalList = events.getBswAsynchronousServerCallReturnsEvent();
            ArrayList<BswAsynchronousServerCallReturnsEventWrapper> wrapperList = (ArrayList<BswAsynchronousServerCallReturnsEventWrapper>)originalList.stream()
                .map(item -> new BswAsynchronousServerCallReturnsEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswBackgroundEventWrapper> getBswBackgroundEvent() {
        
        if (CollUtil.isNotEmpty(events.getBswBackgroundEvent())) {
            ArrayList<BswBackgroundEvent> originalList = events.getBswBackgroundEvent();
            ArrayList<BswBackgroundEventWrapper> wrapperList = (ArrayList<BswBackgroundEventWrapper>)originalList.stream()
                .map(item -> new BswBackgroundEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswDataReceivedEventWrapper> getBswDataReceivedEvent() {
        
        if (CollUtil.isNotEmpty(events.getBswDataReceivedEvent())) {
            ArrayList<BswDataReceivedEvent> originalList = events.getBswDataReceivedEvent();
            ArrayList<BswDataReceivedEventWrapper> wrapperList = (ArrayList<BswDataReceivedEventWrapper>)originalList.stream()
                .map(item -> new BswDataReceivedEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswExternalTriggerOccurredEventWrapper> getBswExternalTriggerOccurredEvent() {
        
        if (CollUtil.isNotEmpty(events.getBswExternalTriggerOccurredEvent())) {
            ArrayList<BswExternalTriggerOccurredEvent> originalList = events.getBswExternalTriggerOccurredEvent();
            ArrayList<BswExternalTriggerOccurredEventWrapper> wrapperList = (ArrayList<BswExternalTriggerOccurredEventWrapper>)originalList.stream()
                .map(item -> new BswExternalTriggerOccurredEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswInternalTriggerOccurredEventWrapper> getBswInternalTriggerOccurredEvent() {
        
        if (CollUtil.isNotEmpty(events.getBswInternalTriggerOccurredEvent())) {
            ArrayList<BswInternalTriggerOccurredEvent> originalList = events.getBswInternalTriggerOccurredEvent();
            ArrayList<BswInternalTriggerOccurredEventWrapper> wrapperList = (ArrayList<BswInternalTriggerOccurredEventWrapper>)originalList.stream()
                .map(item -> new BswInternalTriggerOccurredEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModeManagerErrorEventWrapper> getBswModeManagerErrorEvent() {
        
        if (CollUtil.isNotEmpty(events.getBswModeManagerErrorEvent())) {
            ArrayList<BswModeManagerErrorEvent> originalList = events.getBswModeManagerErrorEvent();
            ArrayList<BswModeManagerErrorEventWrapper> wrapperList = (ArrayList<BswModeManagerErrorEventWrapper>)originalList.stream()
                .map(item -> new BswModeManagerErrorEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModeSwitchEventWrapper> getBswModeSwitchEvent() {
        
        if (CollUtil.isNotEmpty(events.getBswModeSwitchEvent())) {
            ArrayList<BswModeSwitchEvent> originalList = events.getBswModeSwitchEvent();
            ArrayList<BswModeSwitchEventWrapper> wrapperList = (ArrayList<BswModeSwitchEventWrapper>)originalList.stream()
                .map(item -> new BswModeSwitchEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModeSwitchedAckEventWrapper> getBswModeSwitchedAckEvent() {
        
        if (CollUtil.isNotEmpty(events.getBswModeSwitchedAckEvent())) {
            ArrayList<BswModeSwitchedAckEvent> originalList = events.getBswModeSwitchedAckEvent();
            ArrayList<BswModeSwitchedAckEventWrapper> wrapperList = (ArrayList<BswModeSwitchedAckEventWrapper>)originalList.stream()
                .map(item -> new BswModeSwitchedAckEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswOperationInvokedEventWrapper> getBswOperationInvokedEvent() {
        
        if (CollUtil.isNotEmpty(events.getBswOperationInvokedEvent())) {
            ArrayList<BswOperationInvokedEvent> originalList = events.getBswOperationInvokedEvent();
            ArrayList<BswOperationInvokedEventWrapper> wrapperList = (ArrayList<BswOperationInvokedEventWrapper>)originalList.stream()
                .map(item -> new BswOperationInvokedEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswTimingEventWrapper> getBswTimingEvent() {
        
        if (CollUtil.isNotEmpty(events.getBswTimingEvent())) {
            ArrayList<BswTimingEvent> originalList = events.getBswTimingEvent();
            ArrayList<BswTimingEventWrapper> wrapperList = (ArrayList<BswTimingEventWrapper>)originalList.stream()
                .map(item -> new BswTimingEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}