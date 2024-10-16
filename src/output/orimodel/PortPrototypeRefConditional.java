package stdgui.data.model.orimodel;
@XmlRootElement(name = "PORT-PROTOTYPE-REF-CONDITIONAL")
public class PortPrototypeRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PortPrototypeRef portPrototypeRef;
    
    
    
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
    
    
    
    @XmlElement(name="PORT-PROTOTYPE-REF")
    public PortPrototypeRef getPortPrototypeRef() {
    return this.portPrototypeRef;
}

    public void setPortPrototypeRef(PortPrototypeRef value) {
        this.portPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}