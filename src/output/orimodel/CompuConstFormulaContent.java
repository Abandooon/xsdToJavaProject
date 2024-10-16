package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMPU-CONST-FORMULA-CONTENT")
public class CompuConstFormulaContent {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected NumericalValueVariationPoint vf;
    
    

    
    
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
    public NumericalValueVariationPoint getVf() {
    return this.vf;
}

    public void setVf(NumericalValueVariationPoint value) {
        this.vf = value;
    }
    
    
}