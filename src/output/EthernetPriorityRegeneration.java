package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EthernetPriorityRegeneration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected PositiveInteger ingressPriority;
    
    
    
    protected PositiveInteger regeneratedPriority;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
        return this.shortName;
    }

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="INGRESS-PRIORITY")
    public PositiveInteger getIngressPriority() {
        return this.ingressPriority;
    }

    public void setIngressPriority(PositiveInteger value) {
        this.ingressPriority = value;
    }
    
    
    
    @XmlElement(name="REGENERATED-PRIORITY")
    public PositiveInteger getRegeneratedPriority() {
        return this.regeneratedPriority;
    }

    public void setRegeneratedPriority(PositiveInteger value) {
        this.regeneratedPriority = value;
    }
    
    
}