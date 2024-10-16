package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BusDependentNmEcus {

    
    
    protected ArrayList<CanNmEcu> canNmEcu;
    
    
    
    protected ArrayList<FlexrayNmEcu> flexrayNmEcu;
    
    
    
    protected ArrayList<J1939NmEcu> j1939NmEcu;
    
    
    
    protected ArrayList<UdpNmEcu> udpNmEcu;
    
    

    
    
    @XmlElement(name="CAN-NM-ECU")
    public ArrayList<CanNmEcu> getCanNmEcu() {
    return this.canNmEcu;
}

    public void setCanNmEcu(ArrayList<CanNmEcu> value) {
        this.canNmEcu = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-NM-ECU")
    public ArrayList<FlexrayNmEcu> getFlexrayNmEcu() {
    return this.flexrayNmEcu;
}

    public void setFlexrayNmEcu(ArrayList<FlexrayNmEcu> value) {
        this.flexrayNmEcu = value;
    }
    
    
    
    @XmlElement(name="J-1939-NM-ECU")
    public ArrayList<J1939NmEcu> getJ1939NmEcu() {
    return this.j1939NmEcu;
}

    public void setJ1939NmEcu(ArrayList<J1939NmEcu> value) {
        this.j1939NmEcu = value;
    }
    
    
    
    @XmlElement(name="UDP-NM-ECU")
    public ArrayList<UdpNmEcu> getUdpNmEcu() {
    return this.udpNmEcu;
}

    public void setUdpNmEcu(ArrayList<UdpNmEcu> value) {
        this.udpNmEcu = value;
    }
    
    
}