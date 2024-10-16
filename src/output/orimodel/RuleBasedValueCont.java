package stdgui.data.model.orimodel;
@XmlRootElement(name = "RULE-BASED-VALUE-CONT")
public class RuleBasedValueCont {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected UnitRef unitRef;
    
    
    
    protected ValueList swArraysize;
    
    
    
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
    
    
    
    @XmlElement(name="UNIT-REF")
    public UnitRef getUnitRef() {
    return this.unitRef;
}

    public void setUnitRef(UnitRef value) {
        this.unitRef = value;
    }
    
    
    
    @XmlElement(name="SW-ARRAYSIZE")
    public ValueList getSwArraysize() {
    return this.swArraysize;
}

    public void setSwArraysize(ValueList value) {
        this.swArraysize = value;
    }
    
    
    
    @XmlElement(name="RULE-BASED-VALUES")
    public RuleBasedValueSpecification getRuleBasedValues() {
    return this.ruleBasedValues;
}

    public void setRuleBasedValues(RuleBasedValueSpecification value) {
        this.ruleBasedValues = value;
    }
    
    
}