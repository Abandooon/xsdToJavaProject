package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Flowcontrolpdurefs {

    
    
    protected ArrayList<FlowControlPduRef> flowControlPduRefs;
    
    

    
    
    @XmlElement(name="FLOW-CONTROL-PDU-REF")
    public ArrayList<FlowControlPduRef> getFlowControlPduRefs() {
        return this.flowControlPduRefs;
    }

    public void setFlowControlPduRefs(ArrayList<FlowControlPduRef> value) {
        this.flowControlPduRefs = value;
    }
    
    
}