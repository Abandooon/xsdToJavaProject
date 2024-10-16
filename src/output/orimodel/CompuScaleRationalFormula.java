package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMPU-SCALE-RATIONAL-FORMULA")
public class CompuScaleRationalFormula {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CompuRationalCoeffs compuRationalCoeffs;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMPU-RATIONAL-COEFFS")
    public CompuRationalCoeffs getCompuRationalCoeffs() {
    return this.compuRationalCoeffs;
}

    public void setCompuRationalCoeffs(CompuRationalCoeffs value) {
        this.compuRationalCoeffs = value;
    }
    
    
}