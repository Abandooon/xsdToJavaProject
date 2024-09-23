package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Timingguarantees {

    
    
    protected ArrayList<AgeConstraint> ageConstraints;
    
    
    
    protected ArrayList<ArbitraryEventTriggering> arbitraryEventTriggerings;
    
    
    
    protected ArrayList<BurstPatternEventTriggering> burstPatternEventTriggerings;
    
    
    
    protected ArrayList<ConcretePatternEventTriggering> concretePatternEventTriggerings;
    
    
    
    protected ArrayList<ExecutionOrderConstraint> executionOrderConstraints;
    
    
    
    protected ArrayList<ExecutionTimeConstraint> executionTimeConstraints;
    
    
    
    protected ArrayList<LatencyTimingConstraint> latencyTimingConstraints;
    
    
    
    protected ArrayList<OffsetTimingConstraint> offsetTimingConstraints;
    
    
    
    protected ArrayList<PeriodicEventTriggering> periodicEventTriggerings;
    
    
    
    protected ArrayList<SporadicEventTriggering> sporadicEventTriggerings;
    
    
    
    protected ArrayList<SynchronizationTimingConstraint> synchronizationTimingConstraints;
    
    

    
    
    @XmlElement(name="AGE-CONSTRAINT")
    public ArrayList<AgeConstraint> getAgeConstraints() {
        return this.ageConstraints;
    }

    public void setAgeConstraints(ArrayList<AgeConstraint> value) {
        this.ageConstraints = value;
    }
    
    
    
    @XmlElement(name="ARBITRARY-EVENT-TRIGGERING")
    public ArrayList<ArbitraryEventTriggering> getArbitraryEventTriggerings() {
        return this.arbitraryEventTriggerings;
    }

    public void setArbitraryEventTriggerings(ArrayList<ArbitraryEventTriggering> value) {
        this.arbitraryEventTriggerings = value;
    }
    
    
    
    @XmlElement(name="BURST-PATTERN-EVENT-TRIGGERING")
    public ArrayList<BurstPatternEventTriggering> getBurstPatternEventTriggerings() {
        return this.burstPatternEventTriggerings;
    }

    public void setBurstPatternEventTriggerings(ArrayList<BurstPatternEventTriggering> value) {
        this.burstPatternEventTriggerings = value;
    }
    
    
    
    @XmlElement(name="CONCRETE-PATTERN-EVENT-TRIGGERING")
    public ArrayList<ConcretePatternEventTriggering> getConcretePatternEventTriggerings() {
        return this.concretePatternEventTriggerings;
    }

    public void setConcretePatternEventTriggerings(ArrayList<ConcretePatternEventTriggering> value) {
        this.concretePatternEventTriggerings = value;
    }
    
    
    
    @XmlElement(name="EXECUTION-ORDER-CONSTRAINT")
    public ArrayList<ExecutionOrderConstraint> getExecutionOrderConstraints() {
        return this.executionOrderConstraints;
    }

    public void setExecutionOrderConstraints(ArrayList<ExecutionOrderConstraint> value) {
        this.executionOrderConstraints = value;
    }
    
    
    
    @XmlElement(name="EXECUTION-TIME-CONSTRAINT")
    public ArrayList<ExecutionTimeConstraint> getExecutionTimeConstraints() {
        return this.executionTimeConstraints;
    }

    public void setExecutionTimeConstraints(ArrayList<ExecutionTimeConstraint> value) {
        this.executionTimeConstraints = value;
    }
    
    
    
    @XmlElement(name="LATENCY-TIMING-CONSTRAINT")
    public ArrayList<LatencyTimingConstraint> getLatencyTimingConstraints() {
        return this.latencyTimingConstraints;
    }

    public void setLatencyTimingConstraints(ArrayList<LatencyTimingConstraint> value) {
        this.latencyTimingConstraints = value;
    }
    
    
    
    @XmlElement(name="OFFSET-TIMING-CONSTRAINT")
    public ArrayList<OffsetTimingConstraint> getOffsetTimingConstraints() {
        return this.offsetTimingConstraints;
    }

    public void setOffsetTimingConstraints(ArrayList<OffsetTimingConstraint> value) {
        this.offsetTimingConstraints = value;
    }
    
    
    
    @XmlElement(name="PERIODIC-EVENT-TRIGGERING")
    public ArrayList<PeriodicEventTriggering> getPeriodicEventTriggerings() {
        return this.periodicEventTriggerings;
    }

    public void setPeriodicEventTriggerings(ArrayList<PeriodicEventTriggering> value) {
        this.periodicEventTriggerings = value;
    }
    
    
    
    @XmlElement(name="SPORADIC-EVENT-TRIGGERING")
    public ArrayList<SporadicEventTriggering> getSporadicEventTriggerings() {
        return this.sporadicEventTriggerings;
    }

    public void setSporadicEventTriggerings(ArrayList<SporadicEventTriggering> value) {
        this.sporadicEventTriggerings = value;
    }
    
    
    
    @XmlElement(name="SYNCHRONIZATION-TIMING-CONSTRAINT")
    public ArrayList<SynchronizationTimingConstraint> getSynchronizationTimingConstraints() {
        return this.synchronizationTimingConstraints;
    }

    public void setSynchronizationTimingConstraints(ArrayList<SynchronizationTimingConstraint> value) {
        this.synchronizationTimingConstraints = value;
    }
    
    
}