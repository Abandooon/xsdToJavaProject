package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMPU-SCALE")
public class CompuScale {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected CIdentifier symbol;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected PositiveInteger mask;
    
    
    
    protected Limit lowerLimit;
    
    
    
    protected Limit upperLimit;
    
    
    
    protected CompuConst compuInverseValue;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected CompuConst compuConst;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
    return this.shortLabel;
}

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="SYMBOL")
    public CIdentifier getSymbol() {
    return this.symbol;
}

    public void setSymbol(CIdentifier value) {
        this.symbol = value;
    }
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
    return this.desc;
}

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="MASK")
    public PositiveInteger getMask() {
    return this.mask;
}

    public void setMask(PositiveInteger value) {
        this.mask = value;
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
    
    
    
    @XmlElement(name="COMPU-INVERSE-VALUE")
    public CompuConst getCompuInverseValue() {
    return this.compuInverseValue;
}

    public void setCompuInverseValue(CompuConst value) {
        this.compuInverseValue = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="COMPU-CONST")
    public CompuConst getCompuConst() {
    return this.compuConst;
}

    public void setCompuConst(CompuConst value) {
        this.compuConst = value;
    }
    
    
}