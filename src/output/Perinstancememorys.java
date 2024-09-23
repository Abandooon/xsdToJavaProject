package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Perinstancememorys {

    
    
    protected ArrayList<PerInstanceMemory> perInstanceMemorys;
    
    

    
    
    @XmlElement(name="PER-INSTANCE-MEMORY")
    public ArrayList<PerInstanceMemory> getPerInstanceMemorys() {
        return this.perInstanceMemorys;
    }

    public void setPerInstanceMemorys(ArrayList<PerInstanceMemory> value) {
        this.perInstanceMemorys = value;
    }
    
    
}