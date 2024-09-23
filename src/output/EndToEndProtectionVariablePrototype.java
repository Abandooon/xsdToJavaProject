package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EndToEndProtectionVariablePrototype {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ReceiverIrefs receiverIrefs;
    
    
    
    protected VariableDataPrototypeInSystemInstanceRef senderIref;
    
    
    
    protected Identifier shortLabel;
    
    
    
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
    
    
    
    @XmlElement(name="RECEIVER-IREFS")
    public ReceiverIrefs getReceiverIrefs() {
        return this.receiverIrefs;
    }

    public void setReceiverIrefs(ReceiverIrefs value) {
        this.receiverIrefs = value;
    }
    
    
    
    @XmlElement(name="SENDER-IREF")
    public VariableDataPrototypeInSystemInstanceRef getSenderIref() {
        return this.senderIref;
    }

    public void setSenderIref(VariableDataPrototypeInSystemInstanceRef value) {
        this.senderIref = value;
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
    
    
}