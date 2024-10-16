package stdgui.data.model.orimodel;
@XmlRootElement(name = "VALUE-LIST")
public class ValueList {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<NumericalValueVariationPoint> vf;
    
    
    
    protected ArrayList<NumericalValue> v;
    
    

    
    
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
    
    
    
    @XmlElement(name="VF")
    public ArrayList<NumericalValueVariationPoint> getVf() {
    return this.vf;
}

    public void setVf(ArrayList<NumericalValueVariationPoint> value) {
        this.vf = value;
    }
    
    
    
    @XmlElement(name="V")
    public ArrayList<NumericalValue> getV() {
    return this.v;
}

    public void setV(ArrayList<NumericalValue> value) {
        this.v = value;
    }
    
    
}