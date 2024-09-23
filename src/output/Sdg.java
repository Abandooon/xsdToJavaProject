package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Sdg {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String gid;
    
    
    
    protected SdgCaption sdgCaption;
    
    
    
    protected SdgCaptionRef sdgCaptionRef;
    
    
    
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
    
    
    
    @XmlAttribute(name="GID")
    public java.lang.String getGid() {
        return this.gid;
    }

    public void setGid(java.lang.String value) {
        this.gid = value;
    }
    
    
    
    @XmlElement(name="SDG-CAPTION")
    public SdgCaption getSdgCaption() {
        return this.sdgCaption;
    }

    public void setSdgCaption(SdgCaption value) {
        this.sdgCaption = value;
    }
    
    
    
    @XmlElement(name="SDG-CAPTION-REF")
    public SdgCaptionRef getSdgCaptionRef() {
        return this.sdgCaptionRef;
    }

    public void setSdgCaptionRef(SdgCaptionRef value) {
        this.sdgCaptionRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}