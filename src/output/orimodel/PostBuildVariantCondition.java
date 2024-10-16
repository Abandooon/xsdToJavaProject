package stdgui.data.model.orimodel;
@XmlRootElement(name = "POST-BUILD-VARIANT-CONDITION")
public class PostBuildVariantCondition {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MatchingCriterionRef matchingCriterionRef;
    
    
    
    protected IntegerValueVariationPoint value;
    
    

    
    
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
    
    
    
    @XmlElement(name="MATCHING-CRITERION-REF")
    public MatchingCriterionRef getMatchingCriterionRef() {
    return this.matchingCriterionRef;
}

    public void setMatchingCriterionRef(MatchingCriterionRef value) {
        this.matchingCriterionRef = value;
    }
    
    
    
    @XmlElement(name="VALUE")
    public IntegerValueVariationPoint getValue() {
    return this.value;
}

    public void setValue(IntegerValueVariationPoint value) {
        this.value = value;
    }
    
    
}