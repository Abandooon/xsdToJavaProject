package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FrameTriggerings {

    
    
    protected ArrayList<CanFrameTriggering> canFrameTriggering;
    
    
    
    protected ArrayList<EthernetFrameTriggering> ethernetFrameTriggering;
    
    
    
    protected ArrayList<FlexrayFrameTriggering> flexrayFrameTriggering;
    
    
    
    protected ArrayList<LinFrameTriggering> linFrameTriggering;
    
    

    
    
    @XmlElement(name="CAN-FRAME-TRIGGERING")
    public ArrayList<CanFrameTriggering> getCanFrameTriggering() {
    return this.canFrameTriggering;
}

    public void setCanFrameTriggering(ArrayList<CanFrameTriggering> value) {
        this.canFrameTriggering = value;
    }
    
    
    
    @XmlElement(name="ETHERNET-FRAME-TRIGGERING")
    public ArrayList<EthernetFrameTriggering> getEthernetFrameTriggering() {
    return this.ethernetFrameTriggering;
}

    public void setEthernetFrameTriggering(ArrayList<EthernetFrameTriggering> value) {
        this.ethernetFrameTriggering = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-FRAME-TRIGGERING")
    public ArrayList<FlexrayFrameTriggering> getFlexrayFrameTriggering() {
    return this.flexrayFrameTriggering;
}

    public void setFlexrayFrameTriggering(ArrayList<FlexrayFrameTriggering> value) {
        this.flexrayFrameTriggering = value;
    }
    
    
    
    @XmlElement(name="LIN-FRAME-TRIGGERING")
    public ArrayList<LinFrameTriggering> getLinFrameTriggering() {
    return this.linFrameTriggering;
}

    public void setLinFrameTriggering(ArrayList<LinFrameTriggering> value) {
        this.linFrameTriggering = value;
    }
    
    
}