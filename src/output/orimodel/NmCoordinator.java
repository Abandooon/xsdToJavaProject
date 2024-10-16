package stdgui.data.model.orimodel;
@XmlRootElement(name = "NM-COORDINATOR")
public class NmCoordinator {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer index;
    
    
    
    protected Boolean nmActiveCoordinator;
    
    
    
    protected Boolean nmCoordSyncSupport;
    
    
    
    protected TimeValue nmGlobalCoordinatorTime;
    
    
    
    protected ArrayList<NmNodeRef> nmNodeRefs;
    
    
    
    protected TimeValue nmShutdownDelayTimer;
    
    

    
    
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
    
    
    
    @XmlElement(name="INDEX")
    public Integer getIndex() {
    return this.index;
}

    public void setIndex(Integer value) {
        this.index = value;
    }
    
    
    
    @XmlElement(name="NM-ACTIVE-COORDINATOR")
    public Boolean getNmActiveCoordinator() {
    return this.nmActiveCoordinator;
}

    public void setNmActiveCoordinator(Boolean value) {
        this.nmActiveCoordinator = value;
    }
    
    
    
    @XmlElement(name="NM-COORD-SYNC-SUPPORT")
    public Boolean getNmCoordSyncSupport() {
    return this.nmCoordSyncSupport;
}

    public void setNmCoordSyncSupport(Boolean value) {
        this.nmCoordSyncSupport = value;
    }
    
    
    
    @XmlElement(name="NM-GLOBAL-COORDINATOR-TIME")
    public TimeValue getNmGlobalCoordinatorTime() {
    return this.nmGlobalCoordinatorTime;
}

    public void setNmGlobalCoordinatorTime(TimeValue value) {
        this.nmGlobalCoordinatorTime = value;
    }
    
    
    
    @XmlElementWrapper(name="NM-NODE-REFS")
@XmlElement(name="NM-NODE-REF")
    public ArrayList<NmNodeRef> getNmNodeRefs() {
    return this.nmNodeRefs;
}

    public void setNmNodeRefs(ArrayList<NmNodeRef> value) {
        this.nmNodeRefs = value;
    }
    
    
    
    @XmlElement(name="NM-SHUTDOWN-DELAY-TIMER")
    public TimeValue getNmShutdownDelayTimer() {
    return this.nmShutdownDelayTimer;
}

    public void setNmShutdownDelayTimer(TimeValue value) {
        this.nmShutdownDelayTimer = value;
    }
    
    
}