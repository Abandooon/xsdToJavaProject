package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class NmClusters {

    
    
    protected ArrayList<CanNmCluster> canNmCluster;
    
    
    
    protected ArrayList<FlexrayNmCluster> flexrayNmCluster;
    
    
    
    protected ArrayList<J1939NmCluster> j1939NmCluster;
    
    
    
    protected ArrayList<UdpNmCluster> udpNmCluster;
    
    

    
    
    @XmlElement(name="CAN-NM-CLUSTER")
    public ArrayList<CanNmCluster> getCanNmCluster() {
    return this.canNmCluster;
}

    public void setCanNmCluster(ArrayList<CanNmCluster> value) {
        this.canNmCluster = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-NM-CLUSTER")
    public ArrayList<FlexrayNmCluster> getFlexrayNmCluster() {
    return this.flexrayNmCluster;
}

    public void setFlexrayNmCluster(ArrayList<FlexrayNmCluster> value) {
        this.flexrayNmCluster = value;
    }
    
    
    
    @XmlElement(name="J-1939-NM-CLUSTER")
    public ArrayList<J1939NmCluster> getJ1939NmCluster() {
    return this.j1939NmCluster;
}

    public void setJ1939NmCluster(ArrayList<J1939NmCluster> value) {
        this.j1939NmCluster = value;
    }
    
    
    
    @XmlElement(name="UDP-NM-CLUSTER")
    public ArrayList<UdpNmCluster> getUdpNmCluster() {
    return this.udpNmCluster;
}

    public void setUdpNmCluster(ArrayList<UdpNmCluster> value) {
        this.udpNmCluster = value;
    }
    
    
}