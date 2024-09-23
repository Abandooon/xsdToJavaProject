package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Datatypemaps {

    
    
    protected ArrayList<DataTypeMap> dataTypeMaps;
    
    

    
    
    @XmlElement(name="DATA-TYPE-MAP")
    public ArrayList<DataTypeMap> getDataTypeMaps() {
        return this.dataTypeMaps;
    }

    public void setDataTypeMaps(ArrayList<DataTypeMap> value) {
        this.dataTypeMaps = value;
    }
    
    
}