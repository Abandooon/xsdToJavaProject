package stdgui.data.model.orimodel;
@XmlRootElement(name = "CAN-CLUSTER-BUS-OFF-RECOVERY")
public class CanClusterBusOffRecovery {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger borCounterL1ToL2;
    
    
    
    protected TimeValue borTimeL1;
    
    
    
    protected TimeValue borTimeL2;
    
    
    
    protected TimeValue borTimeTxEnsured;
    
    
    
    protected TimeValue mainFunctionPeriod;
    
    

    
    
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
    
    
    
    @XmlElement(name="BOR-COUNTER-L-1-TO-L-2")
    public PositiveInteger getBorCounterL1ToL2() {
    return this.borCounterL1ToL2;
}

    public void setBorCounterL1ToL2(PositiveInteger value) {
        this.borCounterL1ToL2 = value;
    }
    
    
    
    @XmlElement(name="BOR-TIME-L-1")
    public TimeValue getBorTimeL1() {
    return this.borTimeL1;
}

    public void setBorTimeL1(TimeValue value) {
        this.borTimeL1 = value;
    }
    
    
    
    @XmlElement(name="BOR-TIME-L-2")
    public TimeValue getBorTimeL2() {
    return this.borTimeL2;
}

    public void setBorTimeL2(TimeValue value) {
        this.borTimeL2 = value;
    }
    
    
    
    @XmlElement(name="BOR-TIME-TX-ENSURED")
    public TimeValue getBorTimeTxEnsured() {
    return this.borTimeTxEnsured;
}

    public void setBorTimeTxEnsured(TimeValue value) {
        this.borTimeTxEnsured = value;
    }
    
    
    
    @XmlElement(name="MAIN-FUNCTION-PERIOD")
    public TimeValue getMainFunctionPeriod() {
    return this.mainFunctionPeriod;
}

    public void setMainFunctionPeriod(TimeValue value) {
        this.mainFunctionPeriod = value;
    }
    
    
}