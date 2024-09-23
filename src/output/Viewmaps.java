package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Viewmaps {

    
    
    protected ArrayList<ViewMap> viewMaps;
    
    

    
    
    @XmlElement(name="VIEW-MAP")
    public ArrayList<ViewMap> getViewMaps() {
        return this.viewMaps;
    }

    public void setViewMaps(ArrayList<ViewMap> value) {
        this.viewMaps = value;
    }
    
    
}