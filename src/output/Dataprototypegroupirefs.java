package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dataprototypegroupirefs {

    
    
    protected ArrayList<InnerDataPrototypeGroupInCompositionInstanceRef> dataPrototypeGroupIrefs;
    
    

    
    
    @XmlElement(name="DATA-PROTOTYPE-GROUP-IREF")
    public ArrayList<InnerDataPrototypeGroupInCompositionInstanceRef> getDataPrototypeGroupIrefs() {
        return this.dataPrototypeGroupIrefs;
    }

    public void setDataPrototypeGroupIrefs(ArrayList<InnerDataPrototypeGroupInCompositionInstanceRef> value) {
        this.dataPrototypeGroupIrefs = value;
    }
    
    
}