package stdgui.data.model.orimodel;
@XmlRootElement(name = "LIMIT-VALUE")
public class LimitValue {

    
    
    protected java.lang.String value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected IntervalTypeEnumSimple intervalType;
    
    

    
    
    @XmlValue
    public java.lang.String getValue() {
    return this.value;
}

    public void setValue(java.lang.String value) {
        this.value = value;
    }
    
    
    
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
    
    
    
    @XmlAttribute(name="INTERVAL-TYPE")
    public IntervalTypeEnumSimple getIntervalType() {
    return this.intervalType;
}

    public void setIntervalType(IntervalTypeEnumSimple value) {
        this.intervalType = value;
    }
    
    
}