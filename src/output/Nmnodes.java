package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nmnodes {

    
    
    protected ArrayList<CanNmNode> canNmNodes;
    
    
    
    protected ArrayList<FlexrayNmNode> flexrayNmNodes;
    
    
    
    protected ArrayList<J1939NmNode> j1939NmNodes;
    
    
    
    protected ArrayList<UdpNmNode> udpNmNodes;
    
    

    
    
    @XmlElement(name="CAN-NM-NODE")
    public ArrayList<CanNmNode> getCanNmNodes() {
        return this.canNmNodes;
    }

    public void setCanNmNodes(ArrayList<CanNmNode> value) {
        this.canNmNodes = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-NM-NODE")
    public ArrayList<FlexrayNmNode> getFlexrayNmNodes() {
        return this.flexrayNmNodes;
    }

    public void setFlexrayNmNodes(ArrayList<FlexrayNmNode> value) {
        this.flexrayNmNodes = value;
    }
    
    
    
    @XmlElement(name="J-1939-NM-NODE")
    public ArrayList<J1939NmNode> getJ1939NmNodes() {
        return this.j1939NmNodes;
    }

    public void setJ1939NmNodes(ArrayList<J1939NmNode> value) {
        this.j1939NmNodes = value;
    }
    
    
    
    @XmlElement(name="UDP-NM-NODE")
    public ArrayList<UdpNmNode> getUdpNmNodes() {
        return this.udpNmNodes;
    }

    public void setUdpNmNodes(ArrayList<UdpNmNode> value) {
        this.udpNmNodes = value;
    }
    
    
}