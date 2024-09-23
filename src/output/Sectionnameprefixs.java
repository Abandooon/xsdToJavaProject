package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Sectionnameprefixs {

    
    
    protected ArrayList<SectionNamePrefix> sectionNamePrefixs;
    
    

    
    
    @XmlElement(name="SECTION-NAME-PREFIX")
    public ArrayList<SectionNamePrefix> getSectionNamePrefixs() {
        return this.sectionNamePrefixs;
    }

    public void setSectionNamePrefixs(ArrayList<SectionNamePrefix> value) {
        this.sectionNamePrefixs = value;
    }
    
    
}