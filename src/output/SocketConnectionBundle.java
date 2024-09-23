package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SocketConnectionBundle {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected BundledConnections bundledConnections;
    
    
    
    protected Pdus pdus;
    
    
    
    protected ServerPortRef serverPortRef;
    
    
    
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
    
    
    
    @XmlElement(name="BUNDLED-CONNECTIONS")
    public BundledConnections getBundledConnections() {
        return this.bundledConnections;
    }

    public void setBundledConnections(BundledConnections value) {
        this.bundledConnections = value;
    }
    
    
    
    @XmlElement(name="PDUS")
    public Pdus getPdus() {
        return this.pdus;
    }

    public void setPdus(Pdus value) {
        this.pdus = value;
    }
    
    
    
    @XmlElement(name="SERVER-PORT-REF")
    public ServerPortRef getServerPortRef() {
        return this.serverPortRef;
    }

    public void setServerPortRef(ServerPortRef value) {
        this.serverPortRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}