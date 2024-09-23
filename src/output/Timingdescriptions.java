package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Timingdescriptions {

    
    
    protected ArrayList<TdEventBswInternalBehavior> tdEventBswInternalBehaviors;
    
    
    
    protected ArrayList<TdEventBswModeDeclaration> tdEventBswModeDeclarations;
    
    
    
    protected ArrayList<TdEventBswModule> tdEventBswModules;
    
    
    
    protected ArrayList<TdEventComplex> tdEventComplexs;
    
    
    
    protected ArrayList<TdEventFrClusterCycleStart> tdEventFrClusterCycleStarts;
    
    
    
    protected ArrayList<TdEventFrame> tdEventFrames;
    
    
    
    protected ArrayList<TdEventIPdu> tdEventIPdus;
    
    
    
    protected ArrayList<TdEventISignal> tdEventISignals;
    
    
    
    protected ArrayList<TdEventModeDeclaration> tdEventModeDeclarations;
    
    
    
    protected ArrayList<TdEventOperation> tdEventOperations;
    
    
    
    protected ArrayList<TdEventSwcInternalBehavior> tdEventSwcInternalBehaviors;
    
    
    
    protected ArrayList<TdEventSwcInternalBehaviorReference> tdEventSwcInternalBehaviorReferences;
    
    
    
    protected ArrayList<TdEventTtCanCycleStart> tdEventTtCanCycleStarts;
    
    
    
    protected ArrayList<TdEventTrigger> tdEventTriggers;
    
    
    
    protected ArrayList<TdEventVariableDataPrototype> tdEventVariableDataPrototypes;
    
    
    
    protected ArrayList<TdEventVfbReference> tdEventVfbReferences;
    
    
    
    protected ArrayList<TimingDescriptionEventChain> timingDescriptionEventChains;
    
    

    
    
    @XmlElement(name="TD-EVENT-BSW-INTERNAL-BEHAVIOR")
    public ArrayList<TdEventBswInternalBehavior> getTdEventBswInternalBehaviors() {
        return this.tdEventBswInternalBehaviors;
    }

    public void setTdEventBswInternalBehaviors(ArrayList<TdEventBswInternalBehavior> value) {
        this.tdEventBswInternalBehaviors = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-BSW-MODE-DECLARATION")
    public ArrayList<TdEventBswModeDeclaration> getTdEventBswModeDeclarations() {
        return this.tdEventBswModeDeclarations;
    }

    public void setTdEventBswModeDeclarations(ArrayList<TdEventBswModeDeclaration> value) {
        this.tdEventBswModeDeclarations = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-BSW-MODULE")
    public ArrayList<TdEventBswModule> getTdEventBswModules() {
        return this.tdEventBswModules;
    }

    public void setTdEventBswModules(ArrayList<TdEventBswModule> value) {
        this.tdEventBswModules = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-COMPLEX")
    public ArrayList<TdEventComplex> getTdEventComplexs() {
        return this.tdEventComplexs;
    }

    public void setTdEventComplexs(ArrayList<TdEventComplex> value) {
        this.tdEventComplexs = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-FR-CLUSTER-CYCLE-START")
    public ArrayList<TdEventFrClusterCycleStart> getTdEventFrClusterCycleStarts() {
        return this.tdEventFrClusterCycleStarts;
    }

    public void setTdEventFrClusterCycleStarts(ArrayList<TdEventFrClusterCycleStart> value) {
        this.tdEventFrClusterCycleStarts = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-FRAME")
    public ArrayList<TdEventFrame> getTdEventFrames() {
        return this.tdEventFrames;
    }

    public void setTdEventFrames(ArrayList<TdEventFrame> value) {
        this.tdEventFrames = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-I-PDU")
    public ArrayList<TdEventIPdu> getTdEventIPdus() {
        return this.tdEventIPdus;
    }

    public void setTdEventIPdus(ArrayList<TdEventIPdu> value) {
        this.tdEventIPdus = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-I-SIGNAL")
    public ArrayList<TdEventISignal> getTdEventISignals() {
        return this.tdEventISignals;
    }

    public void setTdEventISignals(ArrayList<TdEventISignal> value) {
        this.tdEventISignals = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-MODE-DECLARATION")
    public ArrayList<TdEventModeDeclaration> getTdEventModeDeclarations() {
        return this.tdEventModeDeclarations;
    }

    public void setTdEventModeDeclarations(ArrayList<TdEventModeDeclaration> value) {
        this.tdEventModeDeclarations = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-OPERATION")
    public ArrayList<TdEventOperation> getTdEventOperations() {
        return this.tdEventOperations;
    }

    public void setTdEventOperations(ArrayList<TdEventOperation> value) {
        this.tdEventOperations = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-SWC-INTERNAL-BEHAVIOR")
    public ArrayList<TdEventSwcInternalBehavior> getTdEventSwcInternalBehaviors() {
        return this.tdEventSwcInternalBehaviors;
    }

    public void setTdEventSwcInternalBehaviors(ArrayList<TdEventSwcInternalBehavior> value) {
        this.tdEventSwcInternalBehaviors = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE")
    public ArrayList<TdEventSwcInternalBehaviorReference> getTdEventSwcInternalBehaviorReferences() {
        return this.tdEventSwcInternalBehaviorReferences;
    }

    public void setTdEventSwcInternalBehaviorReferences(ArrayList<TdEventSwcInternalBehaviorReference> value) {
        this.tdEventSwcInternalBehaviorReferences = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-TT-CAN-CYCLE-START")
    public ArrayList<TdEventTtCanCycleStart> getTdEventTtCanCycleStarts() {
        return this.tdEventTtCanCycleStarts;
    }

    public void setTdEventTtCanCycleStarts(ArrayList<TdEventTtCanCycleStart> value) {
        this.tdEventTtCanCycleStarts = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-TRIGGER")
    public ArrayList<TdEventTrigger> getTdEventTriggers() {
        return this.tdEventTriggers;
    }

    public void setTdEventTriggers(ArrayList<TdEventTrigger> value) {
        this.tdEventTriggers = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-VARIABLE-DATA-PROTOTYPE")
    public ArrayList<TdEventVariableDataPrototype> getTdEventVariableDataPrototypes() {
        return this.tdEventVariableDataPrototypes;
    }

    public void setTdEventVariableDataPrototypes(ArrayList<TdEventVariableDataPrototype> value) {
        this.tdEventVariableDataPrototypes = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-VFB-REFERENCE")
    public ArrayList<TdEventVfbReference> getTdEventVfbReferences() {
        return this.tdEventVfbReferences;
    }

    public void setTdEventVfbReferences(ArrayList<TdEventVfbReference> value) {
        this.tdEventVfbReferences = value;
    }
    
    
    
    @XmlElement(name="TIMING-DESCRIPTION-EVENT-CHAIN")
    public ArrayList<TimingDescriptionEventChain> getTimingDescriptionEventChains() {
        return this.timingDescriptionEventChains;
    }

    public void setTimingDescriptionEventChains(ArrayList<TimingDescriptionEventChain> value) {
        this.timingDescriptionEventChains = value;
    }
    
    
}