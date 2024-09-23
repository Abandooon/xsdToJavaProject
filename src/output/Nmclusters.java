package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nmclusters {

    
    
    protected ArrayList<CanNmCluster> canNmClusters;
    
    
    
    protected ArrayList<FlexrayNmCluster> flexrayNmClusters;
    
    
    
    protected ArrayList<J1939NmCluster> j1939NmClusters;
    
    
    
    protected ArrayList<UdpNmCluster> udpNmClusters;
    
    

    
    
    @XmlElement(name="CAN-NM-CLUSTER")
    public ArrayList<CanNmCluster> getCanNmClusters() {
        return this.canNmClusters;
    }

    public void setCanNmClusters(ArrayList<CanNmCluster> value) {
        this.canNmClusters = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-NM-CLUSTER")
    public ArrayList<FlexrayNmCluster> getFlexrayNmClusters() {
        return this.flexrayNmClusters;
    }

    public void setFlexrayNmClusters(ArrayList<FlexrayNmCluster> value) {
        this.flexrayNmClusters = value;
    }
    
    
    
    @XmlElement(name="J-1939-NM-CLUSTER")
    public ArrayList<J1939NmCluster> getJ1939NmClusters() {
        return this.j1939NmClusters;
    }

    public void setJ1939NmClusters(ArrayList<J1939NmCluster> value) {
        this.j1939NmClusters = value;
    }
    
    
    
    @XmlElement(name="UDP-NM-CLUSTER")
    public ArrayList<UdpNmCluster> getUdpNmClusters() {
        return this.udpNmClusters;
    }

    public void setUdpNmClusters(ArrayList<UdpNmCluster> value) {
        this.udpNmClusters = value;
    }
    
    
}