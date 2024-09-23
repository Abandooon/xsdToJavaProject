package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Busdependentnmecus {

    
    
    protected ArrayList<CanNmEcu> canNmEcus;
    
    
    
    protected ArrayList<FlexrayNmEcu> flexrayNmEcus;
    
    
    
    protected ArrayList<J1939NmEcu> j1939NmEcus;
    
    
    
    protected ArrayList<UdpNmEcu> udpNmEcus;
    
    

    
    
    @XmlElement(name="CAN-NM-ECU")
    public ArrayList<CanNmEcu> getCanNmEcus() {
        return this.canNmEcus;
    }

    public void setCanNmEcus(ArrayList<CanNmEcu> value) {
        this.canNmEcus = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-NM-ECU")
    public ArrayList<FlexrayNmEcu> getFlexrayNmEcus() {
        return this.flexrayNmEcus;
    }

    public void setFlexrayNmEcus(ArrayList<FlexrayNmEcu> value) {
        this.flexrayNmEcus = value;
    }
    
    
    
    @XmlElement(name="J-1939-NM-ECU")
    public ArrayList<J1939NmEcu> getJ1939NmEcus() {
        return this.j1939NmEcus;
    }

    public void setJ1939NmEcus(ArrayList<J1939NmEcu> value) {
        this.j1939NmEcus = value;
    }
    
    
    
    @XmlElement(name="UDP-NM-ECU")
    public ArrayList<UdpNmEcu> getUdpNmEcus() {
        return this.udpNmEcus;
    }

    public void setUdpNmEcus(ArrayList<UdpNmEcu> value) {
        this.udpNmEcus = value;
    }
    
    
}