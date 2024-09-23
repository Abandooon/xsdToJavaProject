package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Receiverirefs {

    
    
    protected ArrayList<VariableDataPrototypeInSystemInstanceRef> receiverIrefs;
    
    

    
    
    @XmlElement(name="RECEIVER-IREF")
    public ArrayList<VariableDataPrototypeInSystemInstanceRef> getReceiverIrefs() {
        return this.receiverIrefs;
    }

    public void setReceiverIrefs(ArrayList<VariableDataPrototypeInSystemInstanceRef> value) {
        this.receiverIrefs = value;
    }
    
    
}