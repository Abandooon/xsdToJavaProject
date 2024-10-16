package stdgui.data.model.modelwrapper;


    
    

    
    


public class CommunicationCycleWrapper {

    
    private CommunicationCycle communicationCycle;

    public CommunicationCycleWrapper(CommunicationCycle communicationCycle) {
        this.communicationCycle = communicationCycle;
    }

   
    public CycleCounterWrapper getCycleCounter() {
        
        if (CollUtil.isNotEmpty(communicationCycle.getCycleCounter())) {
            
            return new CycleCounterWrapper(communicationCycle.getCycleCounter());
            
        } else {
            return null;
        }
        
    }

    public CycleRepetitionWrapper getCycleRepetition() {
        
        if (CollUtil.isNotEmpty(communicationCycle.getCycleRepetition())) {
            
            return new CycleRepetitionWrapper(communicationCycle.getCycleRepetition());
            
        } else {
            return null;
        }
        
    }




    


    
}