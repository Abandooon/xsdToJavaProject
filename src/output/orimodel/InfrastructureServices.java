package stdgui.data.model.orimodel;
@XmlRootElement(name = "INFRASTRUCTURE-SERVICES")
public class InfrastructureServices {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DhcpServerConfiguration dhcpServerConfiguration;
    
    
    
    protected DoIpEntity doIpEntity;
    
    
    
    protected TimeSynchronization timeSynchronization;
    
    

    
    
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
    
    
    
    @XmlElement(name="DHCP-SERVER-CONFIGURATION")
    public DhcpServerConfiguration getDhcpServerConfiguration() {
    return this.dhcpServerConfiguration;
}

    public void setDhcpServerConfiguration(DhcpServerConfiguration value) {
        this.dhcpServerConfiguration = value;
    }
    
    
    
    @XmlElement(name="DO-IP-ENTITY")
    public DoIpEntity getDoIpEntity() {
    return this.doIpEntity;
}

    public void setDoIpEntity(DoIpEntity value) {
        this.doIpEntity = value;
    }
    
    
    
    @XmlElement(name="TIME-SYNCHRONIZATION")
    public TimeSynchronization getTimeSynchronization() {
    return this.timeSynchronization;
}

    public void setTimeSynchronization(TimeSynchronization value) {
        this.timeSynchronization = value;
    }
    
    
}