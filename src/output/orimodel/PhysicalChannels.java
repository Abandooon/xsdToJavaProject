package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PhysicalChannels {

    
    
    protected ArrayList<CanPhysicalChannel> canPhysicalChannel;
    
    
    
    protected ArrayList<EthernetPhysicalChannel> ethernetPhysicalChannel;
    
    
    
    protected ArrayList<FlexrayPhysicalChannel> flexrayPhysicalChannel;
    
    
    
    protected ArrayList<LinPhysicalChannel> linPhysicalChannel;
    
    
    
    protected ArrayList<TtcanPhysicalChannel> ttcanPhysicalChannel;
    
    
    
    protected ArrayList<UserDefinedPhysicalChannel> userDefinedPhysicalChannel;
    
    

    
    
    @XmlElement(name="CAN-PHYSICAL-CHANNEL")
    public ArrayList<CanPhysicalChannel> getCanPhysicalChannel() {
    return this.canPhysicalChannel;
}

    public void setCanPhysicalChannel(ArrayList<CanPhysicalChannel> value) {
        this.canPhysicalChannel = value;
    }
    
    
    
    @XmlElement(name="ETHERNET-PHYSICAL-CHANNEL")
    public ArrayList<EthernetPhysicalChannel> getEthernetPhysicalChannel() {
    return this.ethernetPhysicalChannel;
}

    public void setEthernetPhysicalChannel(ArrayList<EthernetPhysicalChannel> value) {
        this.ethernetPhysicalChannel = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-PHYSICAL-CHANNEL")
    public ArrayList<FlexrayPhysicalChannel> getFlexrayPhysicalChannel() {
    return this.flexrayPhysicalChannel;
}

    public void setFlexrayPhysicalChannel(ArrayList<FlexrayPhysicalChannel> value) {
        this.flexrayPhysicalChannel = value;
    }
    
    
    
    @XmlElement(name="LIN-PHYSICAL-CHANNEL")
    public ArrayList<LinPhysicalChannel> getLinPhysicalChannel() {
    return this.linPhysicalChannel;
}

    public void setLinPhysicalChannel(ArrayList<LinPhysicalChannel> value) {
        this.linPhysicalChannel = value;
    }
    
    
    
    @XmlElement(name="TTCAN-PHYSICAL-CHANNEL")
    public ArrayList<TtcanPhysicalChannel> getTtcanPhysicalChannel() {
    return this.ttcanPhysicalChannel;
}

    public void setTtcanPhysicalChannel(ArrayList<TtcanPhysicalChannel> value) {
        this.ttcanPhysicalChannel = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-PHYSICAL-CHANNEL")
    public ArrayList<UserDefinedPhysicalChannel> getUserDefinedPhysicalChannel() {
    return this.userDefinedPhysicalChannel;
}

    public void setUserDefinedPhysicalChannel(ArrayList<UserDefinedPhysicalChannel> value) {
        this.userDefinedPhysicalChannel = value;
    }
    
    
}