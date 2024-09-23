package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SomeipTransformationISignalPropsConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CsTransformerErrorReactionEnum csErrorReaction;
    
    
    
    protected TransformerRef transformerRef;
    
    
    
    protected PositiveInteger interfaceVersion;
    
    
    
    protected SomeipMessageTypeEnum messageType;
    
    
    
    protected SomeipTransformerSessionHandlingEnum sessionHandlingSr;
    
    
    
    protected PositiveInteger sizeOfArrayLengthFields;
    
    
    
    protected PositiveInteger sizeOfStructLengthFields;
    
    
    
    protected PositiveInteger sizeOfUnionLengthFields;
    
    
    
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
    
    
    
    @XmlElement(name="INTERFACE-VERSION")
    public PositiveInteger getInterfaceVersion() {
        return this.interfaceVersion;
    }

    public void setInterfaceVersion(PositiveInteger value) {
        this.interfaceVersion = value;
    }
    
    
    
    @XmlElement(name="MESSAGE-TYPE")
    public SomeipMessageTypeEnum getMessageType() {
        return this.messageType;
    }

    public void setMessageType(SomeipMessageTypeEnum value) {
        this.messageType = value;
    }
    
    
    
    @XmlElement(name="SESSION-HANDLING-SR")
    public SomeipTransformerSessionHandlingEnum getSessionHandlingSr() {
        return this.sessionHandlingSr;
    }

    public void setSessionHandlingSr(SomeipTransformerSessionHandlingEnum value) {
        this.sessionHandlingSr = value;
    }
    
    
    
    @XmlElement(name="SIZE-OF-ARRAY-LENGTH-FIELDS")
    public PositiveInteger getSizeOfArrayLengthFields() {
        return this.sizeOfArrayLengthFields;
    }

    public void setSizeOfArrayLengthFields(PositiveInteger value) {
        this.sizeOfArrayLengthFields = value;
    }
    
    
    
    @XmlElement(name="SIZE-OF-STRUCT-LENGTH-FIELDS")
    public PositiveInteger getSizeOfStructLengthFields() {
        return this.sizeOfStructLengthFields;
    }

    public void setSizeOfStructLengthFields(PositiveInteger value) {
        this.sizeOfStructLengthFields = value;
    }
    
    
    
    @XmlElement(name="SIZE-OF-UNION-LENGTH-FIELDS")
    public PositiveInteger getSizeOfUnionLengthFields() {
        return this.sizeOfUnionLengthFields;
    }

    public void setSizeOfUnionLengthFields(PositiveInteger value) {
        this.sizeOfUnionLengthFields = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}