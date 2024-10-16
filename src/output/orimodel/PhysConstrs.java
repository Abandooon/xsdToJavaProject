package stdgui.data.model.orimodel;
@XmlRootElement(name = "PHYS-CONSTRS")
public class PhysConstrs {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Limit lowerLimit;
    
    
    
    protected Limit upperLimit;
    
    
    
    protected ArrayList<ScaleConstr> scaleConstrs;
    
    
    
    protected NumericalValue maxGradient;
    
    
    
    protected NumericalValue maxDiff;
    
    
    
    protected MonotonyEnum monotony;
    
    
    
    protected UnitRef unitRef;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="SCALE-CONSTRS")
@XmlElement(name="SCALE-CONSTR")
    public ArrayList<ScaleConstr> getScaleConstrs() {
    return this.scaleConstrs;
}

    public void setScaleConstrs(ArrayList<ScaleConstr> value) {
        this.scaleConstrs = value;
    }
    
    
    
    @XmlElement(name="MAX-GRADIENT")
    public NumericalValue getMaxGradient() {
    return this.maxGradient;
}

    public void setMaxGradient(NumericalValue value) {
        this.maxGradient = value;
    }
    
    
    
    @XmlElement(name="MAX-DIFF")
    public NumericalValue getMaxDiff() {
    return this.maxDiff;
}

    public void setMaxDiff(NumericalValue value) {
        this.maxDiff = value;
    }
    
    
    
    @XmlElement(name="MONOTONY")
    public MonotonyEnum getMonotony() {
    return this.monotony;
}

    public void setMonotony(MonotonyEnum value) {
        this.monotony = value;
    }
    
    
    
    @XmlElement(name="UNIT-REF")
    public UnitRef getUnitRef() {
    return this.unitRef;
}

    public void setUnitRef(UnitRef value) {
        this.unitRef = value;
    }
    
    
}