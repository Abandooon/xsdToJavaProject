package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Lifecycleinfos {

    
    
    protected ArrayList<LifeCycleInfo> lifeCycleInfos;
    
    

    
    
    @XmlElement(name="LIFE-CYCLE-INFO")
    public ArrayList<LifeCycleInfo> getLifeCycleInfos() {
        return this.lifeCycleInfos;
    }

    public void setLifeCycleInfos(ArrayList<LifeCycleInfo> value) {
        this.lifeCycleInfos = value;
    }
    
    
}