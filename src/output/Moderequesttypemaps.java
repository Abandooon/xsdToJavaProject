package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Moderequesttypemaps {

    
    
    protected ArrayList<ModeRequestTypeMap> modeRequestTypeMaps;
    
    

    
    
    @XmlElement(name="MODE-REQUEST-TYPE-MAP")
    public ArrayList<ModeRequestTypeMap> getModeRequestTypeMaps() {
        return this.modeRequestTypeMaps;
    }

    public void setModeRequestTypeMaps(ArrayList<ModeRequestTypeMap> value) {
        this.modeRequestTypeMaps = value;
    }
    
    
}