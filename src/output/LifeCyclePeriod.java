package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class LifeCyclePeriod {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Date date;
    
    
    
    protected RevisionLabelString arReleaseVersion;
    
    
    
    protected RevisionLabelString productRelease;
    
    

    
    
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
    
    
    
    @XmlElement(name="DATE")
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date value) {
        this.date = value;
    }
    
    
    
    @XmlElement(name="AR-RELEASE-VERSION")
    public RevisionLabelString getArReleaseVersion() {
        return this.arReleaseVersion;
    }

    public void setArReleaseVersion(RevisionLabelString value) {
        this.arReleaseVersion = value;
    }
    
    
    
    @XmlElement(name="PRODUCT-RELEASE")
    public RevisionLabelString getProductRelease() {
        return this.productRelease;
    }

    public void setProductRelease(RevisionLabelString value) {
        this.productRelease = value;
    }
    
    
}