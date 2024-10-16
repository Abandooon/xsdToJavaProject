package stdgui.data.model.orimodel;
@XmlRootElement(name = "TTCAN-CLUSTER-CONDITIONAL")
public class TtcanClusterConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveUnlimitedInteger baudrate;
    
    
    
    protected PhysicalChannels physicalChannels;
    
    
    
    protected String protocolName;
    
    
    
    protected String protocolVersion;
    
    
    
    protected Integer speed;
    
    
    
    protected CanClusterBusOffRecovery busOffRecovery;
    
    
    
    protected PositiveUnlimitedInteger canFdBaudrate;
    
    
    
    protected Integer basicCycleLength;
    
    
    
    protected TimeValue ntu;
    
    
    
    protected Boolean operationMode;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="BAUDRATE")
    public PositiveUnlimitedInteger getBaudrate() {
    return this.baudrate;
}

    public void setBaudrate(PositiveUnlimitedInteger value) {
        this.baudrate = value;
    }
    
    
    
    @XmlElement(name="PHYSICAL-CHANNELS")
    public PhysicalChannels getPhysicalChannels() {
    return this.physicalChannels;
}

    public void setPhysicalChannels(PhysicalChannels value) {
        this.physicalChannels = value;
    }
    
    
    
    @XmlElement(name="PROTOCOL-NAME")
    public String getProtocolName() {
    return this.protocolName;
}

    public void setProtocolName(String value) {
        this.protocolName = value;
    }
    
    
    
    @XmlElement(name="PROTOCOL-VERSION")
    public String getProtocolVersion() {
    return this.protocolVersion;
}

    public void setProtocolVersion(String value) {
        this.protocolVersion = value;
    }
    
    
    
    @XmlElement(name="SPEED")
    public Integer getSpeed() {
    return this.speed;
}

    public void setSpeed(Integer value) {
        this.speed = value;
    }
    
    
    
    @XmlElement(name="BUS-OFF-RECOVERY")
    public CanClusterBusOffRecovery getBusOffRecovery() {
    return this.busOffRecovery;
}

    public void setBusOffRecovery(CanClusterBusOffRecovery value) {
        this.busOffRecovery = value;
    }
    
    
    
    @XmlElement(name="CAN-FD-BAUDRATE")
    public PositiveUnlimitedInteger getCanFdBaudrate() {
    return this.canFdBaudrate;
}

    public void setCanFdBaudrate(PositiveUnlimitedInteger value) {
        this.canFdBaudrate = value;
    }
    
    
    
    @XmlElement(name="BASIC-CYCLE-LENGTH")
    public Integer getBasicCycleLength() {
    return this.basicCycleLength;
}

    public void setBasicCycleLength(Integer value) {
        this.basicCycleLength = value;
    }
    
    
    
    @XmlElement(name="NTU")
    public TimeValue getNtu() {
    return this.ntu;
}

    public void setNtu(TimeValue value) {
        this.ntu = value;
    }
    
    
    
    @XmlElement(name="OPERATION-MODE")
    public Boolean getOperationMode() {
    return this.operationMode;
}

    public void setOperationMode(Boolean value) {
        this.operationMode = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}