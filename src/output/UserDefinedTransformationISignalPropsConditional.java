package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class UserDefinedTransformationISignalPropsConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CsTransformerErrorReactionEnum csErrorReaction;
    
    
    
    protected TransformerRef transformerRef;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="CS-ERROR-REACTION")
    public CsTransformerErrorReactionEnum getCsErrorReaction() {
        return this.csErrorReaction;
    }

    public void setCsErrorReaction(CsTransformerErrorReactionEnum value) {
        this.csErrorReaction = value;
    }
    
    
    
    @XmlElement(name="TRANSFORMER-REF")
    public TransformerRef getTransformerRef() {
        return this.transformerRef;
    }

    public void setTransformerRef(TransformerRef value) {
        this.transformerRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}