package stdgui.data.model.orimodel;
@XmlRootElement(name = "INSTANTIATION-TIMING-EVENT-PROPS")
public class InstantiationTimingEventProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected InstanceEventInCompositionInstanceRef refinedEventIref;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected TimeValue period;
    
    

    
    
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
    
    
    
    @XmlElement(name="REFINED-EVENT-IREF")
    public InstanceEventInCompositionInstanceRef getRefinedEventIref() {
    return this.refinedEventIref;
}

    public void setRefinedEventIref(InstanceEventInCompositionInstanceRef value) {
        this.refinedEventIref = value;
    }
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
    return this.shortLabel;
}

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="PERIOD")
    public TimeValue getPeriod() {
    return this.period;
}

    public void setPeriod(TimeValue value) {
        this.period = value;
    }
    
    
}