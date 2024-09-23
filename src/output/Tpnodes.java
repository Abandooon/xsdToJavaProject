package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tpnodes {

    
    
    protected ArrayList<LinTpNode> linTpNodes;
    
    

    
    
    @XmlElement(name="LIN-TP-NODE")
    public ArrayList<LinTpNode> getLinTpNodes() {
        return this.linTpNodes;
    }

    public void setLinTpNodes(ArrayList<LinTpNode> value) {
        this.linTpNodes = value;
    }
    
    
}