package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CommunicationCycle {

    
    
    protected CycleCounter cycleCounter;
    
    
    
    protected CycleRepetition cycleRepetition;
    
    

    
    
    @XmlElement(name="CYCLE-COUNTER")
    public CycleCounter getCycleCounter() {
    return this.cycleCounter;
}

    public void setCycleCounter(CycleCounter value) {
        this.cycleCounter = value;
    }
    
    
    
    @XmlElement(name="CYCLE-REPETITION")
    public CycleRepetition getCycleRepetition() {
    return this.cycleRepetition;
}

    public void setCycleRepetition(CycleRepetition value) {
        this.cycleRepetition = value;
    }
    
    
}