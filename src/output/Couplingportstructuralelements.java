package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Couplingportstructuralelements {

    
    
    protected ArrayList<CouplingPortFifo> couplingPortFifos;
    
    
    
    protected ArrayList<CouplingPortScheduler> couplingPortSchedulers;
    
    
    
    protected ArrayList<CouplingPortShaper> couplingPortShapers;
    
    

    
    
    @XmlElement(name="COUPLING-PORT-FIFO")
    public ArrayList<CouplingPortFifo> getCouplingPortFifos() {
        return this.couplingPortFifos;
    }

    public void setCouplingPortFifos(ArrayList<CouplingPortFifo> value) {
        this.couplingPortFifos = value;
    }
    
    
    
    @XmlElement(name="COUPLING-PORT-SCHEDULER")
    public ArrayList<CouplingPortScheduler> getCouplingPortSchedulers() {
        return this.couplingPortSchedulers;
    }

    public void setCouplingPortSchedulers(ArrayList<CouplingPortScheduler> value) {
        this.couplingPortSchedulers = value;
    }
    
    
    
    @XmlElement(name="COUPLING-PORT-SHAPER")
    public ArrayList<CouplingPortShaper> getCouplingPortShapers() {
        return this.couplingPortShapers;
    }

    public void setCouplingPortShapers(ArrayList<CouplingPortShaper> value) {
        this.couplingPortShapers = value;
    }
    
    
}