package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SdgContents {

    
    protected java.lang.String s;
    
    protected java.lang.String t;
    
    protected ArrayList<Sdxref> sdxRef;
    
    protected ArrayList<Sdxf> sdxf;
    
    protected ArrayList<Sd> sd;
    
    protected ArrayList<Sdg> sdg;
    
    protected ArrayList<Sdf> sdf;
    

    
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
    public ArrayList<Sdxref> getSdxRef() {
        return this.sdxRef;
    }

    public void setSdxRef(ArrayList<Sdxref> value) {
        this.sdxRef = value;
    }
    
    @XmlElement(name="SDXF")
    public ArrayList<Sdxf> getSdxf() {
        return this.sdxf;
    }

    public void setSdxf(ArrayList<Sdxf> value) {
        this.sdxf = value;
    }
    
    @XmlElement(name="SD")
    public ArrayList<Sd> getSd() {
        return this.sd;
    }

    public void setSd(ArrayList<Sd> value) {
        this.sd = value;
    }
    
    @XmlElement(name="SDG")
    public ArrayList<Sdg> getSdg() {
        return this.sdg;
    }

    public void setSdg(ArrayList<Sdg> value) {
        this.sdg = value;
    }
    
    @XmlElement(name="SDF")
    public ArrayList<Sdf> getSdf() {
        return this.sdf;
    }

    public void setSdf(ArrayList<Sdf> value) {
        this.sdf = value;
    }
    

    
    public static class SdxRef extends Ref {
        
        protected ReferrableSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public ReferrableSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(ReferrableSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}