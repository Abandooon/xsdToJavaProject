package stdgui.data.model.modelwrapper;


    
    

    
    


public class Events_DiagnosticResponseOnEventWrapper {

    
    private Events_DiagnosticResponseOnEvent events_DiagnosticResponseOnEvent;

    public Events_DiagnosticResponseOnEventWrapper(Events_DiagnosticResponseOnEvent events_DiagnosticResponseOnEvent) {
        this.events_DiagnosticResponseOnEvent = events_DiagnosticResponseOnEvent;
    }

   
    public ArrayList<DiagnosticDataChangeTriggerWrapper> getDiagnosticDataChangeTrigger() {
        
        if (CollUtil.isNotEmpty(events_DiagnosticResponseOnEvent.getDiagnosticDataChangeTrigger())) {
            ArrayList<DiagnosticDataChangeTrigger> originalList = events_DiagnosticResponseOnEvent.getDiagnosticDataChangeTrigger();
            ArrayList<DiagnosticDataChangeTriggerWrapper> wrapperList = (ArrayList<DiagnosticDataChangeTriggerWrapper>)originalList.stream()
                .map(item -> new DiagnosticDataChangeTriggerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticDtcChangeTriggerWrapper> getDiagnosticDtcChangeTrigger() {
        
        if (CollUtil.isNotEmpty(events_DiagnosticResponseOnEvent.getDiagnosticDtcChangeTrigger())) {
            ArrayList<DiagnosticDtcChangeTrigger> originalList = events_DiagnosticResponseOnEvent.getDiagnosticDtcChangeTrigger();
            ArrayList<DiagnosticDtcChangeTriggerWrapper> wrapperList = (ArrayList<DiagnosticDtcChangeTriggerWrapper>)originalList.stream()
                .map(item -> new DiagnosticDtcChangeTriggerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}