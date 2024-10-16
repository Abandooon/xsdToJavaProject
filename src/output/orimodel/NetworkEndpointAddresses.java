package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class NetworkEndpointAddresses {

    
    
    protected ArrayList<Ipv4Configuration> ipv4Configuration;
    
    
    
    protected ArrayList<Ipv6Configuration> ipv6Configuration;
    
    
    
    protected ArrayList<MacMulticastConfiguration> macMulticastConfiguration;
    
    

    
    
    @XmlElement(name="IPV-4-CONFIGURATION")
    public ArrayList<Ipv4Configuration> getIpv4Configuration() {
    return this.ipv4Configuration;
}

    public void setIpv4Configuration(ArrayList<Ipv4Configuration> value) {
        this.ipv4Configuration = value;
    }
    
    
    
    @XmlElement(name="IPV-6-CONFIGURATION")
    public ArrayList<Ipv6Configuration> getIpv6Configuration() {
    return this.ipv6Configuration;
}

    public void setIpv6Configuration(ArrayList<Ipv6Configuration> value) {
        this.ipv6Configuration = value;
    }
    
    
    
    @XmlElement(name="MAC-MULTICAST-CONFIGURATION")
    public ArrayList<MacMulticastConfiguration> getMacMulticastConfiguration() {
    return this.macMulticastConfiguration;
}

    public void setMacMulticastConfiguration(ArrayList<MacMulticastConfiguration> value) {
        this.macMulticastConfiguration = value;
    }
    
    
}