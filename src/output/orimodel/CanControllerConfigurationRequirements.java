package stdgui.data.model.orimodel;
@XmlRootElement(name = "CAN-CONTROLLER-CONFIGURATION-REQUIREMENTS")
public class CanControllerConfigurationRequirements {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CanControllerFdConfiguration canControllerFdAttributes;
    
    
    
    protected CanControllerFdConfigurationRequirements canControllerFdRequirements;
    
    
    
    protected Integer maxNumberOfTimeQuantaPerBit;
    
    
    
    protected Float maxSamplePoint;
    
    
    
    protected Float maxSyncJumpWidth;
    
    
    
    protected Integer minNumberOfTimeQuantaPerBit;
    
    
    
    protected Float minSamplePoint;
    
    
    
    protected Float minSyncJumpWidth;
    
    

    
    
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
    
    
    
    @XmlElement(name="CAN-CONTROLLER-FD-ATTRIBUTES")
    public CanControllerFdConfiguration getCanControllerFdAttributes() {
    return this.canControllerFdAttributes;
}

    public void setCanControllerFdAttributes(CanControllerFdConfiguration value) {
        this.canControllerFdAttributes = value;
    }
    
    
    
    @XmlElement(name="CAN-CONTROLLER-FD-REQUIREMENTS")
    public CanControllerFdConfigurationRequirements getCanControllerFdRequirements() {
    return this.canControllerFdRequirements;
}

    public void setCanControllerFdRequirements(CanControllerFdConfigurationRequirements value) {
        this.canControllerFdRequirements = value;
    }
    
    
    
    @XmlElement(name="MAX-NUMBER-OF-TIME-QUANTA-PER-BIT")
    public Integer getMaxNumberOfTimeQuantaPerBit() {
    return this.maxNumberOfTimeQuantaPerBit;
}

    public void setMaxNumberOfTimeQuantaPerBit(Integer value) {
        this.maxNumberOfTimeQuantaPerBit = value;
    }
    
    
    
    @XmlElement(name="MAX-SAMPLE-POINT")
    public Float getMaxSamplePoint() {
    return this.maxSamplePoint;
}

    public void setMaxSamplePoint(Float value) {
        this.maxSamplePoint = value;
    }
    
    
    
    @XmlElement(name="MAX-SYNC-JUMP-WIDTH")
    public Float getMaxSyncJumpWidth() {
    return this.maxSyncJumpWidth;
}

    public void setMaxSyncJumpWidth(Float value) {
        this.maxSyncJumpWidth = value;
    }
    
    
    
    @XmlElement(name="MIN-NUMBER-OF-TIME-QUANTA-PER-BIT")
    public Integer getMinNumberOfTimeQuantaPerBit() {
    return this.minNumberOfTimeQuantaPerBit;
}

    public void setMinNumberOfTimeQuantaPerBit(Integer value) {
        this.minNumberOfTimeQuantaPerBit = value;
    }
    
    
    
    @XmlElement(name="MIN-SAMPLE-POINT")
    public Float getMinSamplePoint() {
    return this.minSamplePoint;
}

    public void setMinSamplePoint(Float value) {
        this.minSamplePoint = value;
    }
    
    
    
    @XmlElement(name="MIN-SYNC-JUMP-WIDTH")
    public Float getMinSyncJumpWidth() {
    return this.minSyncJumpWidth;
}

    public void setMinSyncJumpWidth(Float value) {
        this.minSyncJumpWidth = value;
    }
    
    
}