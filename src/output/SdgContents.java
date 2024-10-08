package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SdgContents {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<SdxRef> sdxRefs;
    
    
    
    protected ArrayList<EncapsulatedEntryRef_SdgContents> encapsulatedEntryRefs;
    
    
    
    protected ArrayList<ReferrableRefConditional> sdxfs;
    
    
    
    protected ArrayList<Sd> sds;
    
    
    
    protected ArrayList<Sdg> sdgs;
    
    
    
    protected ArrayList<Sdf> sdfs;
    
    

    
    
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
    public ArrayList<SdxRef> getSdxRefs() {
        return this.sdxRefs;
    }

    public void setSdxRefs(ArrayList<SdxRef> value) {
        this.sdxRefs = value;
    }
    
    
    
    @XmlElement(name="ENCAPSULATED-ENTRY-REF")
    public ArrayList<EncapsulatedEntryRef_SdgContents> getEncapsulatedEntryRefs() {
        return this.encapsulatedEntryRefs;
    }

    public void setEncapsulatedEntryRefs(ArrayList<EncapsulatedEntryRef_SdgContents> value) {
        this.encapsulatedEntryRefs = value;
    }
    
    
    
    @XmlElement(name="SDXF")
    public ArrayList<ReferrableRefConditional> getSdxfs() {
        return this.sdxfs;
    }

    public void setSdxfs(ArrayList<ReferrableRefConditional> value) {
        this.sdxfs = value;
    }
    
    
    
    @XmlElement(name="SD")
    public ArrayList<Sd> getSds() {
        return this.sds;
    }

    public void setSds(ArrayList<Sd> value) {
        this.sds = value;
    }
    
    
    
    @XmlElement(name="SDG")
    public ArrayList<Sdg> getSdgs() {
        return this.sdgs;
    }

    public void setSdgs(ArrayList<Sdg> value) {
        this.sdgs = value;
    }
    
    
    
    @XmlElement(name="SDF")
    public ArrayList<Sdf> getSdfs() {
        return this.sdfs;
    }

    public void setSdfs(ArrayList<Sdf> value) {
        this.sdfs = value;
    }
    
    
}