package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Coupledclusterrefs {

    
    
    protected ArrayList<CoupledClusterRef> coupledClusterRefs;
    
    

    
    
    @XmlElement(name="COUPLED-CLUSTER-REF")
    public ArrayList<CoupledClusterRef> getCoupledClusterRefs() {
        return this.coupledClusterRefs;
    }

    public void setCoupledClusterRefs(ArrayList<CoupledClusterRef> value) {
        this.coupledClusterRefs = value;
    }
    
    
}