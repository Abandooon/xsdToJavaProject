package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class NmClusterCouplings {

    
    
    protected ArrayList<CanNmClusterCoupling> canNmClusterCoupling;
    
    
    
    protected ArrayList<FlexrayNmClusterCoupling> flexrayNmClusterCoupling;
    
    
    
    protected ArrayList<UdpNmClusterCoupling> udpNmClusterCoupling;
    
    

    
    
    @XmlElement(name="CAN-NM-CLUSTER-COUPLING")
    public ArrayList<CanNmClusterCoupling> getCanNmClusterCoupling() {
    return this.canNmClusterCoupling;
}

    public void setCanNmClusterCoupling(ArrayList<CanNmClusterCoupling> value) {
        this.canNmClusterCoupling = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-NM-CLUSTER-COUPLING")
    public ArrayList<FlexrayNmClusterCoupling> getFlexrayNmClusterCoupling() {
    return this.flexrayNmClusterCoupling;
}

    public void setFlexrayNmClusterCoupling(ArrayList<FlexrayNmClusterCoupling> value) {
        this.flexrayNmClusterCoupling = value;
    }
    
    
    
    @XmlElement(name="UDP-NM-CLUSTER-COUPLING")
    public ArrayList<UdpNmClusterCoupling> getUdpNmClusterCoupling() {
    return this.udpNmClusterCoupling;
}

    public void setUdpNmClusterCoupling(ArrayList<UdpNmClusterCoupling> value) {
        this.udpNmClusterCoupling = value;
    }
    
    
}