package stdgui.data.model.orimodel;
@XmlRootElement(name = "RULE-ARGUMENTS")
public class RuleArguments {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<NumericalValue> v;
    
    
    
    protected ArrayList<NumericalValueVariationPoint> vf;
    
    
    
    protected ArrayList<VerbatimString> vt;
    
    
    
    protected ArrayList<NumericalOrText> vtf;
    
    
    
    protected ArrayList<VariationPoint> variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="V")
    public ArrayList<NumericalValue> getV() {
    return this.v;
}

    public void setV(ArrayList<NumericalValue> value) {
        this.v = value;
    }
    
    
    
    @XmlElement(name="VF")
    public ArrayList<NumericalValueVariationPoint> getVf() {
    return this.vf;
}

    public void setVf(ArrayList<NumericalValueVariationPoint> value) {
        this.vf = value;
    }
    
    
    
    @XmlElement(name="VT")
    public ArrayList<VerbatimString> getVt() {
    return this.vt;
}

    public void setVt(ArrayList<VerbatimString> value) {
        this.vt = value;
    }
    
    
    
    @XmlElement(name="VTF")
    public ArrayList<NumericalOrText> getVtf() {
    return this.vtf;
}

    public void setVtf(ArrayList<NumericalOrText> value) {
        this.vtf = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public ArrayList<VariationPoint> getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(ArrayList<VariationPoint> value) {
        this.variationPoint = value;
    }
    
    
}