package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nmclustercouplings {

    
    
    protected ArrayList<CanNmClusterCoupling> canNmClusterCouplings;
    
    
    
    protected ArrayList<FlexrayNmClusterCoupling> flexrayNmClusterCouplings;
    
    
    
    protected ArrayList<UdpNmClusterCoupling> udpNmClusterCouplings;
    
    

    
    
    @XmlElement(name="CAN-NM-CLUSTER-COUPLING")
    public ArrayList<CanNmClusterCoupling> getCanNmClusterCouplings() {
        return this.canNmClusterCouplings;
    }

    public void setCanNmClusterCouplings(ArrayList<CanNmClusterCoupling> value) {
        this.canNmClusterCouplings = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-NM-CLUSTER-COUPLING")
    public ArrayList<FlexrayNmClusterCoupling> getFlexrayNmClusterCouplings() {
        return this.flexrayNmClusterCouplings;
    }

    public void setFlexrayNmClusterCouplings(ArrayList<FlexrayNmClusterCoupling> value) {
        this.flexrayNmClusterCouplings = value;
    }
    
    
    
    @XmlElement(name="UDP-NM-CLUSTER-COUPLING")
    public ArrayList<UdpNmClusterCoupling> getUdpNmClusterCouplings() {
        return this.udpNmClusterCouplings;
    }

    public void setUdpNmClusterCouplings(ArrayList<UdpNmClusterCoupling> value) {
        this.udpNmClusterCouplings = value;
    }
    
    
}