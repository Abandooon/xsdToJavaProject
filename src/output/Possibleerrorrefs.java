package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Possibleerrorrefs {

    
    
    protected ArrayList<PossibleErrorRef> possibleErrorRefs;
    
    

    
    
    @XmlElement(name="POSSIBLE-ERROR-REF")
    public ArrayList<PossibleErrorRef> getPossibleErrorRefs() {
        return this.possibleErrorRefs;
    }

    public void setPossibleErrorRefs(ArrayList<PossibleErrorRef> value) {
        this.possibleErrorRefs = value;
    }
    
    
}