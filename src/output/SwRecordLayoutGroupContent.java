package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwRecordLayoutGroupContent {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Swrecordlayoutrefs> swRecordLayoutRefss;
    
    
    
    protected ArrayList<Swrecordlayoutvs> swRecordLayoutVss;
    
    
    
    protected ArrayList<Swrecordlayoutgroups> swRecordLayoutGroupss;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-REF")
    public ArrayList<Swrecordlayoutrefs> getSwRecordLayoutRefss() {
        return this.swRecordLayoutRefss;
    }

    public void setSwRecordLayoutRefss(ArrayList<Swrecordlayoutrefs> value) {
        this.swRecordLayoutRefss = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-V")
    public ArrayList<Swrecordlayoutvs> getSwRecordLayoutVss() {
        return this.swRecordLayoutVss;
    }

    public void setSwRecordLayoutVss(ArrayList<Swrecordlayoutvs> value) {
        this.swRecordLayoutVss = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-GROUP")
    public ArrayList<Swrecordlayoutgroups> getSwRecordLayoutGroupss() {
        return this.swRecordLayoutGroupss;
    }

    public void setSwRecordLayoutGroupss(ArrayList<Swrecordlayoutgroups> value) {
        this.swRecordLayoutGroupss = value;
    }
    
    
}