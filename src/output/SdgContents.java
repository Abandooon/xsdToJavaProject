package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SdgContents {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Sdxrefs> sdxRefss;
    
    
    
    protected ArrayList<Sdxfs> sdxfss;
    
    
    
    protected ArrayList<Sds> sdss;
    
    
    
    protected ArrayList<Sdgs> sdgss;
    
    
    
    protected ArrayList<Sdfs> sdfss;
    
    

    
    
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
    
    
    
    @XmlElement(name="SDX-REF")
    public ArrayList<Sdxrefs> getSdxRefss() {
        return this.sdxRefss;
    }

    public void setSdxRefss(ArrayList<Sdxrefs> value) {
        this.sdxRefss = value;
    }
    
    
    
    @XmlElement(name="SDXF")
    public ArrayList<Sdxfs> getSdxfss() {
        return this.sdxfss;
    }

    public void setSdxfss(ArrayList<Sdxfs> value) {
        this.sdxfss = value;
    }
    
    
    
    @XmlElement(name="SD")
    public ArrayList<Sds> getSdss() {
        return this.sdss;
    }

    public void setSdss(ArrayList<Sds> value) {
        this.sdss = value;
    }
    
    
    
    @XmlElement(name="SDG")
    public ArrayList<Sdgs> getSdgss() {
        return this.sdgss;
    }

    public void setSdgss(ArrayList<Sdgs> value) {
        this.sdgss = value;
    }
    
    
    
    @XmlElement(name="SDF")
    public ArrayList<Sdfs> getSdfss() {
        return this.sdfss;
    }

    public void setSdfss(ArrayList<Sdfs> value) {
        this.sdfss = value;
    }
    
    
}