package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ports {

    
    
    protected ArrayList<PPortPrototype> pPortPrototypes;
    
    
    
    protected ArrayList<PrPortPrototype> prPortPrototypes;
    
    
    
    protected ArrayList<RPortPrototype> rPortPrototypes;
    
    

    
    
    @XmlElement(name="P-PORT-PROTOTYPE")
    public ArrayList<PPortPrototype> getPPortPrototypes() {
        return this.pPortPrototypes;
    }

    public void setPPortPrototypes(ArrayList<PPortPrototype> value) {
        this.pPortPrototypes = value;
    }
    
    
    
    @XmlElement(name="PR-PORT-PROTOTYPE")
    public ArrayList<PrPortPrototype> getPrPortPrototypes() {
        return this.prPortPrototypes;
    }

    public void setPrPortPrototypes(ArrayList<PrPortPrototype> value) {
        this.prPortPrototypes = value;
    }
    
    
    
    @XmlElement(name="R-PORT-PROTOTYPE")
    public ArrayList<RPortPrototype> getRPortPrototypes() {
        return this.rPortPrototypes;
    }

    public void setRPortPrototypes(ArrayList<RPortPrototype> value) {
        this.rPortPrototypes = value;
    }
    
    
}