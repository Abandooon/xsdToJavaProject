package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Caption {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    

    
    
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
    
    
    
    @XmlElement(name="LONG-NAME")
    public MultilanguageLongName getLongName() {
        return this.longName;
    }

    public void setLongName(MultilanguageLongName value) {
        this.longName = value;
    }
    
    


    
    public static class ShortNameFragments {
        

        

        
    }
    
}