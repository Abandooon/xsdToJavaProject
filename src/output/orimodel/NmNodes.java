package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class NmNodes {

    
    
    protected ArrayList<CanNmNode> canNmNode;
    
    
    
    protected ArrayList<FlexrayNmNode> flexrayNmNode;
    
    
    
    protected ArrayList<J1939NmNode> j1939NmNode;
    
    
    
    protected ArrayList<UdpNmNode> udpNmNode;
    
    

    
    
    @XmlElement(name="CAN-NM-NODE")
    public ArrayList<CanNmNode> getCanNmNode() {
    return this.canNmNode;
}

    public void setCanNmNode(ArrayList<CanNmNode> value) {
        this.canNmNode = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-NM-NODE")
    public ArrayList<FlexrayNmNode> getFlexrayNmNode() {
    return this.flexrayNmNode;
}

    public void setFlexrayNmNode(ArrayList<FlexrayNmNode> value) {
        this.flexrayNmNode = value;
    }
    
    
    
    @XmlElement(name="J-1939-NM-NODE")
    public ArrayList<J1939NmNode> getJ1939NmNode() {
    return this.j1939NmNode;
}

    public void setJ1939NmNode(ArrayList<J1939NmNode> value) {
        this.j1939NmNode = value;
    }
    
    
    
    @XmlElement(name="UDP-NM-NODE")
    public ArrayList<UdpNmNode> getUdpNmNode() {
    return this.udpNmNode;
}

    public void setUdpNmNode(ArrayList<UdpNmNode> value) {
        this.udpNmNode = value;
    }
    
    
}