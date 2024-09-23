package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Followupactionrefs {

    
    
    protected ArrayList<FollowUpActionRef> followUpActionRefs;
    
    

    
    
    @XmlElement(name="FOLLOW-UP-ACTION-REF")
    public ArrayList<FollowUpActionRef> getFollowUpActionRefs() {
        return this.followUpActionRefs;
    }

    public void setFollowUpActionRefs(ArrayList<FollowUpActionRef> value) {
        this.followUpActionRefs = value;
    }
    
    
}