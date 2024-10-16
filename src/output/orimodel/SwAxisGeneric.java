package stdgui.data.model.orimodel;
@XmlRootElement(name = "SW-AXIS-GENERIC")
public class SwAxisGeneric {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SwAxisTypeRef swAxisTypeRef;
    
    
    
    protected IntegerValueVariationPoint swNumberOfAxisPoints;
    
    
    
    protected ArrayList<SwGenericAxisParam> swGenericAxisParams;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-AXIS-TYPE-REF")
    public SwAxisTypeRef getSwAxisTypeRef() {
    return this.swAxisTypeRef;
}

    public void setSwAxisTypeRef(SwAxisTypeRef value) {
        this.swAxisTypeRef = value;
    }
    
    
    
    @XmlElement(name="SW-NUMBER-OF-AXIS-POINTS")
    public IntegerValueVariationPoint getSwNumberOfAxisPoints() {
    return this.swNumberOfAxisPoints;
}

    public void setSwNumberOfAxisPoints(IntegerValueVariationPoint value) {
        this.swNumberOfAxisPoints = value;
    }
    
    
    
    @XmlElementWrapper(name="SW-GENERIC-AXIS-PARAMS")
@XmlElement(name="SW-GENERIC-AXIS-PARAM")
    public ArrayList<SwGenericAxisParam> getSwGenericAxisParams() {
    return this.swGenericAxisParams;
}

    public void setSwGenericAxisParams(ArrayList<SwGenericAxisParam> value) {
        this.swGenericAxisParams = value;
    }
    
    
}