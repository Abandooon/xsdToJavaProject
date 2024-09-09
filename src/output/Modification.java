package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modification {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultiLanguageOverviewParagraph change;
    
    
    
    protected MultiLanguageOverviewParagraph reason;
    
    

    
    
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
    
    
    
    @XmlElement(name="CHANGE")
    public MultiLanguageOverviewParagraph getChange() {
        return this.change;
    }

    public void setChange(MultiLanguageOverviewParagraph value) {
        this.change = value;
    }
    
    
    
    @XmlElement(name="REASON")
    public MultiLanguageOverviewParagraph getReason() {
        return this.reason;
    }

    public void setReason(MultiLanguageOverviewParagraph value) {
        this.reason = value;
    }
    
    


    
}