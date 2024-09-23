package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Associatedpduripdugrouprefs {

    
    
    protected ArrayList<AssociatedPdurIPduGroupRef> associatedPdurIPduGroupRefs;
    
    

    
    
    @XmlElement(name="ASSOCIATED-PDUR-I-PDU-GROUP-REF")
    public ArrayList<AssociatedPdurIPduGroupRef> getAssociatedPdurIPduGroupRefs() {
        return this.associatedPdurIPduGroupRefs;
    }

    public void setAssociatedPdurIPduGroupRefs(ArrayList<AssociatedPdurIPduGroupRef> value) {
        this.associatedPdurIPduGroupRefs = value;
    }
    
    
}