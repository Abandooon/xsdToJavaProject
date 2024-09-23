package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EcucNumericalParamValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger index;
    
    
    
    protected DefinitionRef definitionRef;
    
    
    
    protected Annotations annotations;
    
    
    
    protected Boolean isAutoValue;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected NumericalValueVariationPoint value;
    
    

    
    
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
    
    
    
    @XmlElement(name="INDEX")
    public PositiveInteger getIndex() {
        return this.index;
    }

    public void setIndex(PositiveInteger value) {
        this.index = value;
    }
    
    
    
    @XmlElement(name="DEFINITION-REF")
    public DefinitionRef getDefinitionRef() {
        return this.definitionRef;
    }

    public void setDefinitionRef(DefinitionRef value) {
        this.definitionRef = value;
    }
    
    
    
    @XmlElement(name="ANNOTATIONS")
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Annotations value) {
        this.annotations = value;
    }
    
    
    
    @XmlElement(name="IS-AUTO-VALUE")
    public Boolean getIsAutoValue() {
        return this.isAutoValue;
    }

    public void setIsAutoValue(Boolean value) {
        this.isAutoValue = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="VALUE")
    public NumericalValueVariationPoint getValue() {
        return this.value;
    }

    public void setValue(NumericalValueVariationPoint value) {
        this.value = value;
    }
    
    
}