package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TimingDescriptions {

    
    
    protected ArrayList<TdEventBswInternalBehavior> tdEventBswInternalBehavior;
    
    
    
    protected ArrayList<TdEventBswModeDeclaration> tdEventBswModeDeclaration;
    
    
    
    protected ArrayList<TdEventBswModule> tdEventBswModule;
    
    
    
    protected ArrayList<TdEventComplex> tdEventComplex;
    
    
    
    protected ArrayList<TdEventFrClusterCycleStart> tdEventFrClusterCycleStart;
    
    
    
    protected ArrayList<TdEventFrame> tdEventFrame;
    
    
    
    protected ArrayList<TdEventIPdu> tdEventIPdu;
    
    
    
    protected ArrayList<TdEventISignal> tdEventISignal;
    
    
    
    protected ArrayList<TdEventModeDeclaration> tdEventModeDeclaration;
    
    
    
    protected ArrayList<TdEventOperation> tdEventOperation;
    
    
    
    protected ArrayList<TdEventSwcInternalBehavior> tdEventSwcInternalBehavior;
    
    
    
    protected ArrayList<TdEventSwcInternalBehaviorReference> tdEventSwcInternalBehaviorReference;
    
    
    
    protected ArrayList<TdEventTtCanCycleStart> tdEventTtCanCycleStart;
    
    
    
    protected ArrayList<TdEventTrigger> tdEventTrigger;
    
    
    
    protected ArrayList<TdEventVariableDataPrototype> tdEventVariableDataPrototype;
    
    
    
    protected ArrayList<TdEventVfbReference> tdEventVfbReference;
    
    
    
    protected ArrayList<TimingDescriptionEventChain> timingDescriptionEventChain;
    
    

    
    
    @XmlElement(name="TD-EVENT-BSW-INTERNAL-BEHAVIOR")
    public ArrayList<TdEventBswInternalBehavior> getTdEventBswInternalBehavior() {
    return this.tdEventBswInternalBehavior;
}

    public void setTdEventBswInternalBehavior(ArrayList<TdEventBswInternalBehavior> value) {
        this.tdEventBswInternalBehavior = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-BSW-MODE-DECLARATION")
    public ArrayList<TdEventBswModeDeclaration> getTdEventBswModeDeclaration() {
    return this.tdEventBswModeDeclaration;
}

    public void setTdEventBswModeDeclaration(ArrayList<TdEventBswModeDeclaration> value) {
        this.tdEventBswModeDeclaration = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-BSW-MODULE")
    public ArrayList<TdEventBswModule> getTdEventBswModule() {
    return this.tdEventBswModule;
}

    public void setTdEventBswModule(ArrayList<TdEventBswModule> value) {
        this.tdEventBswModule = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-COMPLEX")
    public ArrayList<TdEventComplex> getTdEventComplex() {
    return this.tdEventComplex;
}

    public void setTdEventComplex(ArrayList<TdEventComplex> value) {
        this.tdEventComplex = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-FR-CLUSTER-CYCLE-START")
    public ArrayList<TdEventFrClusterCycleStart> getTdEventFrClusterCycleStart() {
    return this.tdEventFrClusterCycleStart;
}

    public void setTdEventFrClusterCycleStart(ArrayList<TdEventFrClusterCycleStart> value) {
        this.tdEventFrClusterCycleStart = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-FRAME")
    public ArrayList<TdEventFrame> getTdEventFrame() {
    return this.tdEventFrame;
}

    public void setTdEventFrame(ArrayList<TdEventFrame> value) {
        this.tdEventFrame = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-I-PDU")
    public ArrayList<TdEventIPdu> getTdEventIPdu() {
    return this.tdEventIPdu;
}

    public void setTdEventIPdu(ArrayList<TdEventIPdu> value) {
        this.tdEventIPdu = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-I-SIGNAL")
    public ArrayList<TdEventISignal> getTdEventISignal() {
    return this.tdEventISignal;
}

    public void setTdEventISignal(ArrayList<TdEventISignal> value) {
        this.tdEventISignal = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-MODE-DECLARATION")
    public ArrayList<TdEventModeDeclaration> getTdEventModeDeclaration() {
    return this.tdEventModeDeclaration;
}

    public void setTdEventModeDeclaration(ArrayList<TdEventModeDeclaration> value) {
        this.tdEventModeDeclaration = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-OPERATION")
    public ArrayList<TdEventOperation> getTdEventOperation() {
    return this.tdEventOperation;
}

    public void setTdEventOperation(ArrayList<TdEventOperation> value) {
        this.tdEventOperation = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-SWC-INTERNAL-BEHAVIOR")
    public ArrayList<TdEventSwcInternalBehavior> getTdEventSwcInternalBehavior() {
    return this.tdEventSwcInternalBehavior;
}

    public void setTdEventSwcInternalBehavior(ArrayList<TdEventSwcInternalBehavior> value) {
        this.tdEventSwcInternalBehavior = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE")
    public ArrayList<TdEventSwcInternalBehaviorReference> getTdEventSwcInternalBehaviorReference() {
    return this.tdEventSwcInternalBehaviorReference;
}

    public void setTdEventSwcInternalBehaviorReference(ArrayList<TdEventSwcInternalBehaviorReference> value) {
        this.tdEventSwcInternalBehaviorReference = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-TT-CAN-CYCLE-START")
    public ArrayList<TdEventTtCanCycleStart> getTdEventTtCanCycleStart() {
    return this.tdEventTtCanCycleStart;
}

    public void setTdEventTtCanCycleStart(ArrayList<TdEventTtCanCycleStart> value) {
        this.tdEventTtCanCycleStart = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-TRIGGER")
    public ArrayList<TdEventTrigger> getTdEventTrigger() {
    return this.tdEventTrigger;
}

    public void setTdEventTrigger(ArrayList<TdEventTrigger> value) {
        this.tdEventTrigger = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-VARIABLE-DATA-PROTOTYPE")
    public ArrayList<TdEventVariableDataPrototype> getTdEventVariableDataPrototype() {
    return this.tdEventVariableDataPrototype;
}

    public void setTdEventVariableDataPrototype(ArrayList<TdEventVariableDataPrototype> value) {
        this.tdEventVariableDataPrototype = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-VFB-REFERENCE")
    public ArrayList<TdEventVfbReference> getTdEventVfbReference() {
    return this.tdEventVfbReference;
}

    public void setTdEventVfbReference(ArrayList<TdEventVfbReference> value) {
        this.tdEventVfbReference = value;
    }
    
    
    
    @XmlElement(name="TIMING-DESCRIPTION-EVENT-CHAIN")
    public ArrayList<TimingDescriptionEventChain> getTimingDescriptionEventChain() {
    return this.timingDescriptionEventChain;
}

    public void setTimingDescriptionEventChain(ArrayList<TimingDescriptionEventChain> value) {
        this.timingDescriptionEventChain = value;
    }
    
    
}