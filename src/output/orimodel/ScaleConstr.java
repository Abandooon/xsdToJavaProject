package stdgui.data.model.orimodel;
@XmlRootElement(name = "SCALE-CONSTR")
public class ScaleConstr {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ScaleConstrValidityEnumSimple validity;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected Limit lowerLimit;
    
    
    
    protected Limit upperLimit;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="VALIDITY")
    public ScaleConstrValidityEnumSimple getValidity() {
    return this.validity;
}

    public void setValidity(ScaleConstrValidityEnumSimple value) {
        this.validity = value;
    }
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
    return this.shortLabel;
}

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
    return this.desc;
}

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="LOWER-LIMIT")
    public Limit getLowerLimit() {
    return this.lowerLimit;
}

    public void setLowerLimit(Limit value) {
        this.lowerLimit = value;
    }
    
    
    
    @XmlElement(name="UPPER-LIMIT")
    public Limit getUpperLimit() {
    return this.upperLimit;
}

    public void setUpperLimit(Limit value) {
        this.upperLimit = value;
    }
    
    
}