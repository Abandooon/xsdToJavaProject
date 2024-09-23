package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Rpthooks {

    
    
    protected ArrayList<RptHook> rptHooks;
    
    

    
    
    @XmlElement(name="RPT-HOOK")
    public ArrayList<RptHook> getRptHooks() {
        return this.rptHooks;
    }

    public void setRptHooks(ArrayList<RptHook> value) {
        this.rptHooks = value;
    }
    
    
}