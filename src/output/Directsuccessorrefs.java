package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Directsuccessorrefs {

    
    
    protected ArrayList<DirectSuccessorRef> directSuccessorRefs;
    
    

    
    
    @XmlElement(name="DIRECT-SUCCESSOR-REF")
    public ArrayList<DirectSuccessorRef> getDirectSuccessorRefs() {
        return this.directSuccessorRefs;
    }

    public void setDirectSuccessorRefs(ArrayList<DirectSuccessorRef> value) {
        this.directSuccessorRefs = value;
    }
    
    
}