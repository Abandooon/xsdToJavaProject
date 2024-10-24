package stdgui.data.model.orimodel;
@XmlRootElement(name = "NUMERICAL-RULE-BASED-VALUE-SPECIFICATION")
public class NumericalRuleBasedValueSpecification {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected RuleBasedValueSpecification ruleBasedValues;
    
    

    
    
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
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="RULE-BASED-VALUES")
    public RuleBasedValueSpecification getRuleBasedValues() {
    return this.ruleBasedValues;
}

    public void setRuleBasedValues(RuleBasedValueSpecification value) {
        this.ruleBasedValues = value;
    }
    
    
}