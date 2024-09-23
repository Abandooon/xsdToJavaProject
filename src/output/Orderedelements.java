package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Orderedelements {

    
    
    protected ArrayList<EocEventRef> eocEventRefs;
    
    
    
    protected ArrayList<EocExecutableEntityRef> eocExecutableEntityRefs;
    
    
    
    protected ArrayList<EocExecutableEntityRefGroup> eocExecutableEntityRefGroups;
    
    

    
    
    @XmlElement(name="EOC-EVENT-REF")
    public ArrayList<EocEventRef> getEocEventRefs() {
        return this.eocEventRefs;
    }

    public void setEocEventRefs(ArrayList<EocEventRef> value) {
        this.eocEventRefs = value;
    }
    
    
    
    @XmlElement(name="EOC-EXECUTABLE-ENTITY-REF")
    public ArrayList<EocExecutableEntityRef> getEocExecutableEntityRefs() {
        return this.eocExecutableEntityRefs;
    }

    public void setEocExecutableEntityRefs(ArrayList<EocExecutableEntityRef> value) {
        this.eocExecutableEntityRefs = value;
    }
    
    
    
    @XmlElement(name="EOC-EXECUTABLE-ENTITY-REF-GROUP")
    public ArrayList<EocExecutableEntityRefGroup> getEocExecutableEntityRefGroups() {
        return this.eocExecutableEntityRefGroups;
    }

    public void setEocExecutableEntityRefGroups(ArrayList<EocExecutableEntityRefGroup> value) {
        this.eocExecutableEntityRefGroups = value;
    }
    
    
}