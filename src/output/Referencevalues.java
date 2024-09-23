package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Referencevalues {

    
    
    protected ArrayList<EcucInstanceReferenceValue> ecucInstanceReferenceValues;
    
    
    
    protected ArrayList<EcucReferenceValue> ecucReferenceValues;
    
    

    
    
    @XmlElement(name="ECUC-INSTANCE-REFERENCE-VALUE")
    public ArrayList<EcucInstanceReferenceValue> getEcucInstanceReferenceValues() {
        return this.ecucInstanceReferenceValues;
    }

    public void setEcucInstanceReferenceValues(ArrayList<EcucInstanceReferenceValue> value) {
        this.ecucInstanceReferenceValues = value;
    }
    
    
    
    @XmlElement(name="ECUC-REFERENCE-VALUE")
    public ArrayList<EcucReferenceValue> getEcucReferenceValues() {
        return this.ecucReferenceValues;
    }

    public void setEcucReferenceValues(ArrayList<EcucReferenceValue> value) {
        this.ecucReferenceValues = value;
    }
    
    
}