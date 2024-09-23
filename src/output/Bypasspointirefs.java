package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Bypasspointirefs {

    
    
    protected ArrayList<AnyInstanceRef> byPassPointIrefs;
    
    

    
    
    @XmlElement(name="BY-PASS-POINT-IREF")
    public ArrayList<AnyInstanceRef> getByPassPointIrefs() {
        return this.byPassPointIrefs;
    }

    public void setByPassPointIrefs(ArrayList<AnyInstanceRef> value) {
        this.byPassPointIrefs = value;
    }
    
    
}