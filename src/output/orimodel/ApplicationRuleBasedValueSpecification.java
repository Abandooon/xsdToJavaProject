package stdgui.data.model.orimodel;
@XmlRootElement(name = "APPLICATION-RULE-BASED-VALUE-SPECIFICATION")
public class ApplicationRuleBasedValueSpecification {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected Identifier category;
    
    
    
    protected ArrayList<RuleBasedAxisCont> swAxisConts;
    
    
    
    protected RuleBasedValueCont swValueCont;
    
    

    
    
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
    
    
    
    @XmlElement(name="CATEGORY")
    public Identifier getCategory() {
    return this.category;
}

    public void setCategory(Identifier value) {
        this.category = value;
    }
    
    
    
    @XmlElementWrapper(name="SW-AXIS-CONTS")
@XmlElement(name="RULE-BASED-AXIS-CONT")
    public ArrayList<RuleBasedAxisCont> getSwAxisConts() {
    return this.swAxisConts;
}

    public void setSwAxisConts(ArrayList<RuleBasedAxisCont> value) {
        this.swAxisConts = value;
    }
    
    
    
    @XmlElement(name="SW-VALUE-CONT")
    public RuleBasedValueCont getSwValueCont() {
    return this.swValueCont;
}

    public void setSwValueCont(RuleBasedValueCont value) {
        this.swValueCont = value;
    }
    
    
}