package stdgui.data.model.orimodel;
@XmlRootElement(name = "PRM-CHAR-NUMERICAL-CONTENTS")
public class PrmCharNumericalContents {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SingleLanguageUnitNames prmUnit;
    
    
    
    protected NumericalValue abs;
    
    
    
    protected NumericalValue tol;
    
    

    
    
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
    
    
    
    @XmlElement(name="PRM-UNIT")
    public SingleLanguageUnitNames getPrmUnit() {
    return this.prmUnit;
}

    public void setPrmUnit(SingleLanguageUnitNames value) {
        this.prmUnit = value;
    }
    
    
    
    @XmlElement(name="ABS")
    public NumericalValue getAbs() {
    return this.abs;
}

    public void setAbs(NumericalValue value) {
        this.abs = value;
    }
    
    
    
    @XmlElement(name="TOL")
    public NumericalValue getTol() {
    return this.tol;
}

    public void setTol(NumericalValue value) {
        this.tol = value;
    }
    
    
}