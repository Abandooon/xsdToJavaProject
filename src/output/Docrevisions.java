package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Docrevisions {

    
    
    protected ArrayList<DocRevision> docRevisions;
    
    

    
    
    @XmlElement(name="DOC-REVISION")
    public ArrayList<DocRevision> getDocRevisions() {
        return this.docRevisions;
    }

    public void setDocRevisions(ArrayList<DocRevision> value) {
        this.docRevisions = value;
    }
    
    
}