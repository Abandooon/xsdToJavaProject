package stdgui.data.model.orimodel;
@XmlRootElement(name = "IPV-6-CONFIGURATION")
public class Ipv6Configuration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger assignmentPriority;
    
    
    
    protected Ip6AddressString defaultRouter;
    
    
    
    protected ArrayList<Ip6AddressString> dnsServerAddresses;
    
    
    
    protected PositiveInteger hopCount;
    
    
    
    protected IpAddressKeepEnum ipAddressKeepBehavior;
    
    
    
    protected PositiveInteger ipAddressPrefixLength;
    
    
    
    protected Ip6AddressString ipv6Address;
    
    
    
    protected Ipv6AddressSourceEnum ipv6AddressSource;
    
    

    
    
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
    
    
    
    @XmlElement(name="ASSIGNMENT-PRIORITY")
    public PositiveInteger getAssignmentPriority() {
    return this.assignmentPriority;
}

    public void setAssignmentPriority(PositiveInteger value) {
        this.assignmentPriority = value;
    }
    
    
    
    @XmlElement(name="DEFAULT-ROUTER")
    public Ip6AddressString getDefaultRouter() {
    return this.defaultRouter;
}

    public void setDefaultRouter(Ip6AddressString value) {
        this.defaultRouter = value;
    }
    
    
    
    @XmlElementWrapper(name="DNS-SERVER-ADDRESSES")
@XmlElement(name="DNS-SERVER-ADDRESS")
    public ArrayList<Ip6AddressString> getDnsServerAddresses() {
    return this.dnsServerAddresses;
}

    public void setDnsServerAddresses(ArrayList<Ip6AddressString> value) {
        this.dnsServerAddresses = value;
    }
    
    
    
    @XmlElement(name="HOP-COUNT")
    public PositiveInteger getHopCount() {
    return this.hopCount;
}

    public void setHopCount(PositiveInteger value) {
        this.hopCount = value;
    }
    
    
    
    @XmlElement(name="IP-ADDRESS-KEEP-BEHAVIOR")
    public IpAddressKeepEnum getIpAddressKeepBehavior() {
    return this.ipAddressKeepBehavior;
}

    public void setIpAddressKeepBehavior(IpAddressKeepEnum value) {
        this.ipAddressKeepBehavior = value;
    }
    
    
    
    @XmlElement(name="IP-ADDRESS-PREFIX-LENGTH")
    public PositiveInteger getIpAddressPrefixLength() {
    return this.ipAddressPrefixLength;
}

    public void setIpAddressPrefixLength(PositiveInteger value) {
        this.ipAddressPrefixLength = value;
    }
    
    
    
    @XmlElement(name="IPV-6-ADDRESS")
    public Ip6AddressString getIpv6Address() {
    return this.ipv6Address;
}

    public void setIpv6Address(Ip6AddressString value) {
        this.ipv6Address = value;
    }
    
    
    
    @XmlElement(name="IPV-6-ADDRESS-SOURCE")
    public Ipv6AddressSourceEnum getIpv6AddressSource() {
    return this.ipv6AddressSource;
}

    public void setIpv6AddressSource(Ipv6AddressSourceEnum value) {
        this.ipv6AddressSource = value;
    }
    
    
}