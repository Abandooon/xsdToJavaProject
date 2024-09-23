package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dpgrequirescoherencys {

    
    
    protected ArrayList<DataPrototypeGroup> dataPrototypeGroups;
    
    

    
    
    @XmlElement(name="DATA-PROTOTYPE-GROUP")
    public ArrayList<DataPrototypeGroup> getDataPrototypeGroups() {
        return this.dataPrototypeGroups;
    }

    public void setDataPrototypeGroups(ArrayList<DataPrototypeGroup> value) {
        this.dataPrototypeGroups = value;
    }
    
    
}