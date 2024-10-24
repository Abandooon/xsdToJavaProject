package stdgui.data.model.orimodel;
@XmlRootElement(name = "HW-PORT-MAPPING")
public class HwPortMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CommunicationConnectorRef communicationConnectorRef;
    
    
    
    protected HwCommunicationPortRef hwCommunicationPortRef;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
    return this.s;
}

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
    return this.t;
}

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="COMMUNICATION-CONNECTOR-REF")
    public CommunicationConnectorRef getCommunicationConnectorRef() {
    return this.communicationConnectorRef;
}

    public void setCommunicationConnectorRef(CommunicationConnectorRef value) {
        this.communicationConnectorRef = value;
    }
    
    
    
    @XmlElement(name="HW-COMMUNICATION-PORT-REF")
    public HwCommunicationPortRef getHwCommunicationPortRef() {
    return this.hwCommunicationPortRef;
}

    public void setHwCommunicationPortRef(HwCommunicationPortRef value) {
        this.hwCommunicationPortRef = value;
    }
    
    
}