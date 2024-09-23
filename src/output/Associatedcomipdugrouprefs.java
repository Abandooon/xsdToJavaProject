package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Associatedcomipdugrouprefs {

    
    
    protected ArrayList<AssociatedComIPduGroupRef> associatedComIPduGroupRefs;
    
    

    
    
    @XmlElement(name="ASSOCIATED-COM-I-PDU-GROUP-REF")
    public ArrayList<AssociatedComIPduGroupRef> getAssociatedComIPduGroupRefs() {
        return this.associatedComIPduGroupRefs;
    }

    public void setAssociatedComIPduGroupRefs(ArrayList<AssociatedComIPduGroupRef> value) {
        this.associatedComIPduGroupRefs = value;
    }
    
    
}