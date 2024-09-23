package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Impliedoperationrefs {

    
    
    protected ArrayList<ImpliedOperationRef> impliedOperationRefs;
    
    

    
    
    @XmlElement(name="IMPLIED-OPERATION-REF")
    public ArrayList<ImpliedOperationRef> getImpliedOperationRefs() {
        return this.impliedOperationRefs;
    }

    public void setImpliedOperationRefs(ArrayList<ImpliedOperationRef> value) {
        this.impliedOperationRefs = value;
    }
    
    
}