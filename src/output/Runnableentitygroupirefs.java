package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Runnableentitygroupirefs {

    
    
    protected ArrayList<InnerRunnableEntityGroupInCompositionInstanceRef> runnableEntityGroupIrefs;
    
    

    
    
    @XmlElement(name="RUNNABLE-ENTITY-GROUP-IREF")
    public ArrayList<InnerRunnableEntityGroupInCompositionInstanceRef> getRunnableEntityGroupIrefs() {
        return this.runnableEntityGroupIrefs;
    }

    public void setRunnableEntityGroupIrefs(ArrayList<InnerRunnableEntityGroupInCompositionInstanceRef> value) {
        this.runnableEntityGroupIrefs = value;
    }
    
    
}