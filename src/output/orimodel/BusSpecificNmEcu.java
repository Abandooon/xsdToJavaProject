package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BusSpecificNmEcu {

    
    
    protected CanNmEcu canNmEcu;
    
    
    
    protected FlexrayNmEcu flexrayNmEcu;
    
    
    
    protected J1939NmEcu j1939NmEcu;
    
    
    
    protected UdpNmEcu udpNmEcu;
    
    

    
    
    @XmlElement(name="CAN-NM-ECU")
    public CanNmEcu getCanNmEcu() {
    return this.canNmEcu;
}

    public void setCanNmEcu(CanNmEcu value) {
        this.canNmEcu = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-NM-ECU")
    public FlexrayNmEcu getFlexrayNmEcu() {
    return this.flexrayNmEcu;
}

    public void setFlexrayNmEcu(FlexrayNmEcu value) {
        this.flexrayNmEcu = value;
    }
    
    
    
    @XmlElement(name="J-1939-NM-ECU")
    public J1939NmEcu getJ1939NmEcu() {
    return this.j1939NmEcu;
}

    public void setJ1939NmEcu(J1939NmEcu value) {
        this.j1939NmEcu = value;
    }
    
    
    
    @XmlElement(name="UDP-NM-ECU")
    public UdpNmEcu getUdpNmEcu() {
    return this.udpNmEcu;
}

    public void setUdpNmEcu(UdpNmEcu value) {
        this.udpNmEcu = value;
    }
    
    
}