package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TimingRequirements {

    
    
    protected ArrayList<AgeConstraint> ageConstraint;
    
    
    
    protected ArrayList<ArbitraryEventTriggering> arbitraryEventTriggering;
    
    
    
    protected ArrayList<BurstPatternEventTriggering> burstPatternEventTriggering;
    
    
    
    protected ArrayList<ConcretePatternEventTriggering> concretePatternEventTriggering;
    
    
    
    protected ArrayList<ExecutionOrderConstraint> executionOrderConstraint;
    
    
    
    protected ArrayList<ExecutionTimeConstraint> executionTimeConstraint;
    
    
    
    protected ArrayList<LatencyTimingConstraint> latencyTimingConstraint;
    
    
    
    protected ArrayList<OffsetTimingConstraint> offsetTimingConstraint;
    
    
    
    protected ArrayList<PeriodicEventTriggering> periodicEventTriggering;
    
    
    
    protected ArrayList<SporadicEventTriggering> sporadicEventTriggering;
    
    
    
    protected ArrayList<SynchronizationTimingConstraint> synchronizationTimingConstraint;
    
    

    
    
    @XmlElement(name="AGE-CONSTRAINT")
    public ArrayList<AgeConstraint> getAgeConstraint() {
    return this.ageConstraint;
}

    public void setAgeConstraint(ArrayList<AgeConstraint> value) {
        this.ageConstraint = value;
    }
    
    
    
    @XmlElement(name="ARBITRARY-EVENT-TRIGGERING")
    public ArrayList<ArbitraryEventTriggering> getArbitraryEventTriggering() {
    return this.arbitraryEventTriggering;
}

    public void setArbitraryEventTriggering(ArrayList<ArbitraryEventTriggering> value) {
        this.arbitraryEventTriggering = value;
    }
    
    
    
    @XmlElement(name="BURST-PATTERN-EVENT-TRIGGERING")
    public ArrayList<BurstPatternEventTriggering> getBurstPatternEventTriggering() {
    return this.burstPatternEventTriggering;
}

    public void setBurstPatternEventTriggering(ArrayList<BurstPatternEventTriggering> value) {
        this.burstPatternEventTriggering = value;
    }
    
    
    
    @XmlElement(name="CONCRETE-PATTERN-EVENT-TRIGGERING")
    public ArrayList<ConcretePatternEventTriggering> getConcretePatternEventTriggering() {
    return this.concretePatternEventTriggering;
}

    public void setConcretePatternEventTriggering(ArrayList<ConcretePatternEventTriggering> value) {
        this.concretePatternEventTriggering = value;
    }
    
    
    
    @XmlElement(name="EXECUTION-ORDER-CONSTRAINT")
    public ArrayList<ExecutionOrderConstraint> getExecutionOrderConstraint() {
    return this.executionOrderConstraint;
}

    public void setExecutionOrderConstraint(ArrayList<ExecutionOrderConstraint> value) {
        this.executionOrderConstraint = value;
    }
    
    
    
    @XmlElement(name="EXECUTION-TIME-CONSTRAINT")
    public ArrayList<ExecutionTimeConstraint> getExecutionTimeConstraint() {
    return this.executionTimeConstraint;
}

    public void setExecutionTimeConstraint(ArrayList<ExecutionTimeConstraint> value) {
        this.executionTimeConstraint = value;
    }
    
    
    
    @XmlElement(name="LATENCY-TIMING-CONSTRAINT")
    public ArrayList<LatencyTimingConstraint> getLatencyTimingConstraint() {
    return this.latencyTimingConstraint;
}

    public void setLatencyTimingConstraint(ArrayList<LatencyTimingConstraint> value) {
        this.latencyTimingConstraint = value;
    }
    
    
    
    @XmlElement(name="OFFSET-TIMING-CONSTRAINT")
    public ArrayList<OffsetTimingConstraint> getOffsetTimingConstraint() {
    return this.offsetTimingConstraint;
}

    public void setOffsetTimingConstraint(ArrayList<OffsetTimingConstraint> value) {
        this.offsetTimingConstraint = value;
    }
    
    
    
    @XmlElement(name="PERIODIC-EVENT-TRIGGERING")
    public ArrayList<PeriodicEventTriggering> getPeriodicEventTriggering() {
    return this.periodicEventTriggering;
}

    public void setPeriodicEventTriggering(ArrayList<PeriodicEventTriggering> value) {
        this.periodicEventTriggering = value;
    }
    
    
    
    @XmlElement(name="SPORADIC-EVENT-TRIGGERING")
    public ArrayList<SporadicEventTriggering> getSporadicEventTriggering() {
    return this.sporadicEventTriggering;
}

    public void setSporadicEventTriggering(ArrayList<SporadicEventTriggering> value) {
        this.sporadicEventTriggering = value;
    }
    
    
    
    @XmlElement(name="SYNCHRONIZATION-TIMING-CONSTRAINT")
    public ArrayList<SynchronizationTimingConstraint> getSynchronizationTimingConstraint() {
    return this.synchronizationTimingConstraint;
}

    public void setSynchronizationTimingConstraint(ArrayList<SynchronizationTimingConstraint> value) {
        this.synchronizationTimingConstraint = value;
    }
    
    
}