package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BuildActionInvocator {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected VerbatimString command;
    
    
    
    protected Sdgs sdgs;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMMAND")
    public VerbatimString getCommand() {
        return this.command;
    }

    public void setCommand(VerbatimString value) {
        this.command = value;
    }
    
    
    
    @XmlElement(name="SDGS")
    public Sdgs getSdgs() {
        return this.sdgs;
    }

    public void setSdgs(Sdgs value) {
        this.sdgs = value;
    }
    
    
}