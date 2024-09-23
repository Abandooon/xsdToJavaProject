package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class RuleArguments {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Vs> vss;
    
    
    
    protected ArrayList<Vfs> vfss;
    
    
    
    protected ArrayList<Vts> vtss;
    
    
    
    protected ArrayList<Vtfs> vtfss;
    
    
    
    protected ArrayList<Variationpoints> variationPointss;
    
    

    
    
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
    
    
    
    @XmlElement(name="V")
    public ArrayList<Vs> getVss() {
        return this.vss;
    }

    public void setVss(ArrayList<Vs> value) {
        this.vss = value;
    }
    
    
    
    @XmlElement(name="VF")
    public ArrayList<Vfs> getVfss() {
        return this.vfss;
    }

    public void setVfss(ArrayList<Vfs> value) {
        this.vfss = value;
    }
    
    
    
    @XmlElement(name="VT")
    public ArrayList<Vts> getVtss() {
        return this.vtss;
    }

    public void setVtss(ArrayList<Vts> value) {
        this.vtss = value;
    }
    
    
    
    @XmlElement(name="VTF")
    public ArrayList<Vtfs> getVtfss() {
        return this.vtfss;
    }

    public void setVtfss(ArrayList<Vtfs> value) {
        this.vtfss = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public ArrayList<Variationpoints> getVariationPointss() {
        return this.variationPointss;
    }

    public void setVariationPointss(ArrayList<Variationpoints> value) {
        this.variationPointss = value;
    }
    
    
}