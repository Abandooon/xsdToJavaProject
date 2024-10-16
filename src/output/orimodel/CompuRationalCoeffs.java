package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMPU-RATIONAL-COEFFS")
public class CompuRationalCoeffs {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CompuNominatorDenominator compuNumerator;
    
    
    
    protected CompuNominatorDenominator compuDenominator;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMPU-NUMERATOR")
    public CompuNominatorDenominator getCompuNumerator() {
    return this.compuNumerator;
}

    public void setCompuNumerator(CompuNominatorDenominator value) {
        this.compuNumerator = value;
    }
    
    
    
    @XmlElement(name="COMPU-DENOMINATOR")
    public CompuNominatorDenominator getCompuDenominator() {
    return this.compuDenominator;
}

    public void setCompuDenominator(CompuNominatorDenominator value) {
        this.compuDenominator = value;
    }
    
    
}