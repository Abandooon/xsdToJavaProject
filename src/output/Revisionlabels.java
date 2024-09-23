package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Revisionlabels {

    
    
    protected ArrayList<RevisionLabelString> revisionLabels;
    
    

    
    
    @XmlElement(name="REVISION-LABEL")
    public ArrayList<RevisionLabelString> getRevisionLabels() {
        return this.revisionLabels;
    }

    public void setRevisionLabels(ArrayList<RevisionLabelString> value) {
        this.revisionLabels = value;
    }
    
    
}