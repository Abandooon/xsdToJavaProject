package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Executableentityrefs {

    
    
    protected ArrayList<ExecutableEntityRef> executableEntityRefs;
    
    

    
    
    @XmlElement(name="EXECUTABLE-ENTITY-REF")
    public ArrayList<ExecutableEntityRef> getExecutableEntityRefs() {
        return this.executableEntityRefs;
    }

    public void setExecutableEntityRefs(ArrayList<ExecutableEntityRef> value) {
        this.executableEntityRefs = value;
    }
    
    
}