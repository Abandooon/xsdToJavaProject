package stdgui.data.model.orimodel;
@XmlRootElement(name = "ASSIGN-FRAME-ID-RANGE")
public class AssignFrameIdRange {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected TimeValue delay;
    
    
    
    protected Integer positionInTable;
    
    
    
    protected AssignedControllerRef assignedControllerRef;
    
    
    
    protected AssignedLinSlaveConfigRef assignedLinSlaveConfigRef;
    
    
    
    protected ArrayList<FramePid> framePids;
    
    
    
    protected Integer startIndex;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
    return this.s;
}

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
    return this.t;
}

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="DELAY")
    public TimeValue getDelay() {
    return this.delay;
}

    public void setDelay(TimeValue value) {
        this.delay = value;
    }
    
    
    
    @XmlElement(name="POSITION-IN-TABLE")
    public Integer getPositionInTable() {
    return this.positionInTable;
}

    public void setPositionInTable(Integer value) {
        this.positionInTable = value;
    }
    
    
    
    @XmlElement(name="ASSIGNED-CONTROLLER-REF")
    public AssignedControllerRef getAssignedControllerRef() {
    return this.assignedControllerRef;
}

    public void setAssignedControllerRef(AssignedControllerRef value) {
        this.assignedControllerRef = value;
    }
    
    
    
    @XmlElement(name="ASSIGNED-LIN-SLAVE-CONFIG-REF")
    public AssignedLinSlaveConfigRef getAssignedLinSlaveConfigRef() {
    return this.assignedLinSlaveConfigRef;
}

    public void setAssignedLinSlaveConfigRef(AssignedLinSlaveConfigRef value) {
        this.assignedLinSlaveConfigRef = value;
    }
    
    
    
    @XmlElementWrapper(name="FRAME-PIDS")
@XmlElement(name="FRAME-PID")
    public ArrayList<FramePid> getFramePids() {
    return this.framePids;
}

    public void setFramePids(ArrayList<FramePid> value) {
        this.framePids = value;
    }
    
    
    
    @XmlElement(name="START-INDEX")
    public Integer getStartIndex() {
    return this.startIndex;
}

    public void setStartIndex(Integer value) {
        this.startIndex = value;
    }
    
    
}