package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Valueaccess {

    
    
    protected BooleanValueVariationPoint booleanValueVariationPoint;
    
    
    
    protected FloatValueVariationPoint floatValueVariationPoint;
    
    
    
    protected IntegerValueVariationPoint integerValueVariationPoint;
    
    
    
    protected Limit limit;
    
    
    
    protected NumericalValueVariationPoint numericalValueVariationPoint;
    
    
    
    protected PositiveIntegerValueVariationPoint positiveIntegerValueVariationPoint;
    
    
    
    protected UnlimitedIntegerValueVariationPoint unlimitedIntegerValueVariationPoint;
    
    

    
    
    @XmlElement(name="BOOLEAN-VALUE-VARIATION-POINT")
    public BooleanValueVariationPoint getBooleanValueVariationPoint() {
        return this.booleanValueVariationPoint;
    }

    public void setBooleanValueVariationPoint(BooleanValueVariationPoint value) {
        this.booleanValueVariationPoint = value;
    }
    
    
    
    @XmlElement(name="FLOAT-VALUE-VARIATION-POINT")
    public FloatValueVariationPoint getFloatValueVariationPoint() {
        return this.floatValueVariationPoint;
    }

    public void setFloatValueVariationPoint(FloatValueVariationPoint value) {
        this.floatValueVariationPoint = value;
    }
    
    
    
    @XmlElement(name="INTEGER-VALUE-VARIATION-POINT")
    public IntegerValueVariationPoint getIntegerValueVariationPoint() {
        return this.integerValueVariationPoint;
    }

    public void setIntegerValueVariationPoint(IntegerValueVariationPoint value) {
        this.integerValueVariationPoint = value;
    }
    
    
    
    @XmlElement(name="LIMIT")
    public Limit getLimit() {
        return this.limit;
    }

    public void setLimit(Limit value) {
        this.limit = value;
    }
    
    
    
    @XmlElement(name="NUMERICAL-VALUE-VARIATION-POINT")
    public NumericalValueVariationPoint getNumericalValueVariationPoint() {
        return this.numericalValueVariationPoint;
    }

    public void setNumericalValueVariationPoint(NumericalValueVariationPoint value) {
        this.numericalValueVariationPoint = value;
    }
    
    
    
    @XmlElement(name="POSITIVE-INTEGER-VALUE-VARIATION-POINT")
    public PositiveIntegerValueVariationPoint getPositiveIntegerValueVariationPoint() {
        return this.positiveIntegerValueVariationPoint;
    }

    public void setPositiveIntegerValueVariationPoint(PositiveIntegerValueVariationPoint value) {
        this.positiveIntegerValueVariationPoint = value;
    }
    
    
    
    @XmlElement(name="UNLIMITED-INTEGER-VALUE-VARIATION-POINT")
    public UnlimitedIntegerValueVariationPoint getUnlimitedIntegerValueVariationPoint() {
        return this.unlimitedIntegerValueVariationPoint;
    }

    public void setUnlimitedIntegerValueVariationPoint(UnlimitedIntegerValueVariationPoint value) {
        this.unlimitedIntegerValueVariationPoint = value;
    }
    
    
}