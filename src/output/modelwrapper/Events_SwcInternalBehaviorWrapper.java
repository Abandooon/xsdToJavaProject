package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class Events_SwcInternalBehaviorWrapper {

    
    private Events_SwcInternalBehavior events_SwcInternalBehavior;

    public Events_SwcInternalBehaviorWrapper(Events_SwcInternalBehavior events_SwcInternalBehavior) {
        this.events_SwcInternalBehavior = events_SwcInternalBehavior;
    }

   
    public ArrayList<AsynchronousServerCallReturnsEventWrapper> getAsynchronousServerCallReturnsEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getAsynchronousServerCallReturnsEvent())) {
            ArrayList<AsynchronousServerCallReturnsEvent> originalList = events_SwcInternalBehavior.getAsynchronousServerCallReturnsEvent();
            ArrayList<AsynchronousServerCallReturnsEventWrapper> wrapperList = (ArrayList<AsynchronousServerCallReturnsEventWrapper>)originalList.stream()
                .map(item -> new AsynchronousServerCallReturnsEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BackgroundEventWrapper> getBackgroundEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getBackgroundEvent())) {
            ArrayList<BackgroundEvent> originalList = events_SwcInternalBehavior.getBackgroundEvent();
            ArrayList<BackgroundEventWrapper> wrapperList = (ArrayList<BackgroundEventWrapper>)originalList.stream()
                .map(item -> new BackgroundEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataReceiveErrorEventWrapper> getDataReceiveErrorEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getDataReceiveErrorEvent())) {
            ArrayList<DataReceiveErrorEvent> originalList = events_SwcInternalBehavior.getDataReceiveErrorEvent();
            ArrayList<DataReceiveErrorEventWrapper> wrapperList = (ArrayList<DataReceiveErrorEventWrapper>)originalList.stream()
                .map(item -> new DataReceiveErrorEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataReceivedEventWrapper> getDataReceivedEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getDataReceivedEvent())) {
            ArrayList<DataReceivedEvent> originalList = events_SwcInternalBehavior.getDataReceivedEvent();
            ArrayList<DataReceivedEventWrapper> wrapperList = (ArrayList<DataReceivedEventWrapper>)originalList.stream()
                .map(item -> new DataReceivedEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataSendCompletedEventWrapper> getDataSendCompletedEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getDataSendCompletedEvent())) {
            ArrayList<DataSendCompletedEvent> originalList = events_SwcInternalBehavior.getDataSendCompletedEvent();
            ArrayList<DataSendCompletedEventWrapper> wrapperList = (ArrayList<DataSendCompletedEventWrapper>)originalList.stream()
                .map(item -> new DataSendCompletedEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataWriteCompletedEventWrapper> getDataWriteCompletedEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getDataWriteCompletedEvent())) {
            ArrayList<DataWriteCompletedEvent> originalList = events_SwcInternalBehavior.getDataWriteCompletedEvent();
            ArrayList<DataWriteCompletedEventWrapper> wrapperList = (ArrayList<DataWriteCompletedEventWrapper>)originalList.stream()
                .map(item -> new DataWriteCompletedEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExternalTriggerOccurredEventWrapper> getExternalTriggerOccurredEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getExternalTriggerOccurredEvent())) {
            ArrayList<ExternalTriggerOccurredEvent> originalList = events_SwcInternalBehavior.getExternalTriggerOccurredEvent();
            ArrayList<ExternalTriggerOccurredEventWrapper> wrapperList = (ArrayList<ExternalTriggerOccurredEventWrapper>)originalList.stream()
                .map(item -> new ExternalTriggerOccurredEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InitEventWrapper> getInitEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getInitEvent())) {
            ArrayList<InitEvent> originalList = events_SwcInternalBehavior.getInitEvent();
            ArrayList<InitEventWrapper> wrapperList = (ArrayList<InitEventWrapper>)originalList.stream()
                .map(item -> new InitEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InternalTriggerOccurredEventWrapper> getInternalTriggerOccurredEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getInternalTriggerOccurredEvent())) {
            ArrayList<InternalTriggerOccurredEvent> originalList = events_SwcInternalBehavior.getInternalTriggerOccurredEvent();
            ArrayList<InternalTriggerOccurredEventWrapper> wrapperList = (ArrayList<InternalTriggerOccurredEventWrapper>)originalList.stream()
                .map(item -> new InternalTriggerOccurredEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeSwitchedAckEventWrapper> getModeSwitchedAckEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getModeSwitchedAckEvent())) {
            ArrayList<ModeSwitchedAckEvent> originalList = events_SwcInternalBehavior.getModeSwitchedAckEvent();
            ArrayList<ModeSwitchedAckEventWrapper> wrapperList = (ArrayList<ModeSwitchedAckEventWrapper>)originalList.stream()
                .map(item -> new ModeSwitchedAckEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<OperationInvokedEventWrapper> getOperationInvokedEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getOperationInvokedEvent())) {
            ArrayList<OperationInvokedEvent> originalList = events_SwcInternalBehavior.getOperationInvokedEvent();
            ArrayList<OperationInvokedEventWrapper> wrapperList = (ArrayList<OperationInvokedEventWrapper>)originalList.stream()
                .map(item -> new OperationInvokedEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcModeManagerErrorEventWrapper> getSwcModeManagerErrorEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getSwcModeManagerErrorEvent())) {
            ArrayList<SwcModeManagerErrorEvent> originalList = events_SwcInternalBehavior.getSwcModeManagerErrorEvent();
            ArrayList<SwcModeManagerErrorEventWrapper> wrapperList = (ArrayList<SwcModeManagerErrorEventWrapper>)originalList.stream()
                .map(item -> new SwcModeManagerErrorEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcModeSwitchEventWrapper> getSwcModeSwitchEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getSwcModeSwitchEvent())) {
            ArrayList<SwcModeSwitchEvent> originalList = events_SwcInternalBehavior.getSwcModeSwitchEvent();
            ArrayList<SwcModeSwitchEventWrapper> wrapperList = (ArrayList<SwcModeSwitchEventWrapper>)originalList.stream()
                .map(item -> new SwcModeSwitchEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TimingEventWrapper> getTimingEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getTimingEvent())) {
            ArrayList<TimingEvent> originalList = events_SwcInternalBehavior.getTimingEvent();
            ArrayList<TimingEventWrapper> wrapperList = (ArrayList<TimingEventWrapper>)originalList.stream()
                .map(item -> new TimingEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TransformerHardErrorEventWrapper> getTransformerHardErrorEvent() {
        
        if (CollUtil.isNotEmpty(events_SwcInternalBehavior.getTransformerHardErrorEvent())) {
            ArrayList<TransformerHardErrorEvent> originalList = events_SwcInternalBehavior.getTransformerHardErrorEvent();
            ArrayList<TransformerHardErrorEventWrapper> wrapperList = (ArrayList<TransformerHardErrorEventWrapper>)originalList.stream()
                .map(item -> new TransformerHardErrorEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}