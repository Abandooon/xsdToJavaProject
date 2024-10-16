package stdgui.data.model.orimodel;
@XmlRootElement(name = "INITIAL-SD-DELAY-CONFIG")
public class InitialSdDelayConfig {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TimeValue initialDelayMaxValue;
    
    
    
    protected TimeValue initialDelayMinValue;
    
    
    
    protected TimeValue initialRepetitionsBaseDelay;
    
    
    
    protected PositiveInteger initialRepetitionsMax;
    
    

    
    
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
    
    
    
    @XmlElement(name="INITIAL-DELAY-MAX-VALUE")
    public TimeValue getInitialDelayMaxValue() {
    return this.initialDelayMaxValue;
}

    public void setInitialDelayMaxValue(TimeValue value) {
        this.initialDelayMaxValue = value;
    }
    
    
    
    @XmlElement(name="INITIAL-DELAY-MIN-VALUE")
    public TimeValue getInitialDelayMinValue() {
    return this.initialDelayMinValue;
}

    public void setInitialDelayMinValue(TimeValue value) {
        this.initialDelayMinValue = value;
    }
    
    
    
    @XmlElement(name="INITIAL-REPETITIONS-BASE-DELAY")
    public TimeValue getInitialRepetitionsBaseDelay() {
    return this.initialRepetitionsBaseDelay;
}

    public void setInitialRepetitionsBaseDelay(TimeValue value) {
        this.initialRepetitionsBaseDelay = value;
    }
    
    
    
    @XmlElement(name="INITIAL-REPETITIONS-MAX")
    public PositiveInteger getInitialRepetitionsMax() {
    return this.initialRepetitionsMax;
}

    public void setInitialRepetitionsMax(PositiveInteger value) {
        this.initialRepetitionsMax = value;
    }
    
    
}