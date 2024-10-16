package stdgui.data.model.orimodel;
@XmlRootElement(name = "MODE-ACCESS-POINT")
public class ModeAccessPoint {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ModeAccessPointIdent ident;
    
    
    
    protected ModeGroupIref modeGroupIref;
    
    
    
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
    
    
    
    @XmlElement(name="IDENT")
    public ModeAccessPointIdent getIdent() {
    return this.ident;
}

    public void setIdent(ModeAccessPointIdent value) {
        this.ident = value;
    }
    
    
    
    @XmlElement(name="MODE-GROUP-IREF")
    public ModeGroupIref getModeGroupIref() {
    return this.modeGroupIref;
}

    public void setModeGroupIref(ModeGroupIref value) {
        this.modeGroupIref = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}