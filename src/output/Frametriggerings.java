package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Frametriggerings {

    
    
    protected ArrayList<CanFrameTriggering> canFrameTriggerings;
    
    
    
    protected ArrayList<EthernetFrameTriggering> ethernetFrameTriggerings;
    
    
    
    protected ArrayList<FlexrayFrameTriggering> flexrayFrameTriggerings;
    
    
    
    protected ArrayList<LinFrameTriggering> linFrameTriggerings;
    
    

    
    
    @XmlElement(name="CAN-FRAME-TRIGGERING")
    public ArrayList<CanFrameTriggering> getCanFrameTriggerings() {
        return this.canFrameTriggerings;
    }

    public void setCanFrameTriggerings(ArrayList<CanFrameTriggering> value) {
        this.canFrameTriggerings = value;
    }
    
    
    
    @XmlElement(name="ETHERNET-FRAME-TRIGGERING")
    public ArrayList<EthernetFrameTriggering> getEthernetFrameTriggerings() {
        return this.ethernetFrameTriggerings;
    }

    public void setEthernetFrameTriggerings(ArrayList<EthernetFrameTriggering> value) {
        this.ethernetFrameTriggerings = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-FRAME-TRIGGERING")
    public ArrayList<FlexrayFrameTriggering> getFlexrayFrameTriggerings() {
        return this.flexrayFrameTriggerings;
    }

    public void setFlexrayFrameTriggerings(ArrayList<FlexrayFrameTriggering> value) {
        this.flexrayFrameTriggerings = value;
    }
    
    
    
    @XmlElement(name="LIN-FRAME-TRIGGERING")
    public ArrayList<LinFrameTriggering> getLinFrameTriggerings() {
        return this.linFrameTriggerings;
    }

    public void setLinFrameTriggerings(ArrayList<LinFrameTriggering> value) {
        this.linFrameTriggerings = value;
    }
    
    
}