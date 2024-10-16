package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagEventDebounceAlgorithm {

    
    
    protected DiagEventDebounceCounterBased diagEventDebounceCounterBased;
    
    
    
    protected DiagEventDebounceMonitorInternal diagEventDebounceMonitorInternal;
    
    
    
    protected DiagEventDebounceTimeBased diagEventDebounceTimeBased;
    
    

    
    
    @XmlElement(name="DIAG-EVENT-DEBOUNCE-COUNTER-BASED")
    public DiagEventDebounceCounterBased getDiagEventDebounceCounterBased() {
    return this.diagEventDebounceCounterBased;
}

    public void setDiagEventDebounceCounterBased(DiagEventDebounceCounterBased value) {
        this.diagEventDebounceCounterBased = value;
    }
    
    
    
    @XmlElement(name="DIAG-EVENT-DEBOUNCE-MONITOR-INTERNAL")
    public DiagEventDebounceMonitorInternal getDiagEventDebounceMonitorInternal() {
    return this.diagEventDebounceMonitorInternal;
}

    public void setDiagEventDebounceMonitorInternal(DiagEventDebounceMonitorInternal value) {
        this.diagEventDebounceMonitorInternal = value;
    }
    
    
    
    @XmlElement(name="DIAG-EVENT-DEBOUNCE-TIME-BASED")
    public DiagEventDebounceTimeBased getDiagEventDebounceTimeBased() {
    return this.diagEventDebounceTimeBased;
}

    public void setDiagEventDebounceTimeBased(DiagEventDebounceTimeBased value) {
        this.diagEventDebounceTimeBased = value;
    }
    
    
}