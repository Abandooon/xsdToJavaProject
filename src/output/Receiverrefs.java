package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Receiverrefs {

    
    
    protected ArrayList<ReceiverRef> receiverRefs;
    
    

    
    
    @XmlElement(name="RECEIVER-REF")
    public ArrayList<ReceiverRef> getReceiverRefs() {
        return this.receiverRefs;
    }

    public void setReceiverRefs(ArrayList<ReceiverRef> value) {
        this.receiverRefs = value;
    }
    
    
}