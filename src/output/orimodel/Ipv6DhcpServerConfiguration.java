package stdgui.data.model.orimodel;
@XmlRootElement(name = "IPV-6-DHCP-SERVER-CONFIGURATION")
public class Ipv6DhcpServerConfiguration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected AdminData adminData;
    
    
    
    protected Ip6AddressString addressRangeLowerBound;
    
    
    
    protected Ip6AddressString addressRangeUpperBound;
    
    
    
    protected Ip6AddressString defaultGateway;
    
    
    
    protected TimeValue defaultLeaseTime;
    
    
    
    protected ArrayList<Ip6AddressString> dnsServerAddresses;
    
    
    
    protected Ip6AddressString networkMask;
    
    

    
    
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
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
    return this.desc;
}

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public CategoryString getCategory() {
    return this.category;
}

    public void setCategory(CategoryString value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="ADMIN-DATA")
    public AdminData getAdminData() {
    return this.adminData;
}

    public void setAdminData(AdminData value) {
        this.adminData = value;
    }
    
    
    
    @XmlElement(name="ADDRESS-RANGE-LOWER-BOUND")
    public Ip6AddressString getAddressRangeLowerBound() {
    return this.addressRangeLowerBound;
}

    public void setAddressRangeLowerBound(Ip6AddressString value) {
        this.addressRangeLowerBound = value;
    }
    
    
    
    @XmlElement(name="ADDRESS-RANGE-UPPER-BOUND")
    public Ip6AddressString getAddressRangeUpperBound() {
    return this.addressRangeUpperBound;
}

    public void setAddressRangeUpperBound(Ip6AddressString value) {
        this.addressRangeUpperBound = value;
    }
    
    
    
    @XmlElement(name="DEFAULT-GATEWAY")
    public Ip6AddressString getDefaultGateway() {
    return this.defaultGateway;
}

    public void setDefaultGateway(Ip6AddressString value) {
        this.defaultGateway = value;
    }
    
    
    
    @XmlElement(name="DEFAULT-LEASE-TIME")
    public TimeValue getDefaultLeaseTime() {
    return this.defaultLeaseTime;
}

    public void setDefaultLeaseTime(TimeValue value) {
        this.defaultLeaseTime = value;
    }
    
    
    
    @XmlElementWrapper(name="DNS-SERVER-ADDRESSES")
@XmlElement(name="DNS-SERVER-ADDRESS")
    public ArrayList<Ip6AddressString> getDnsServerAddresses() {
    return this.dnsServerAddresses;
}

    public void setDnsServerAddresses(ArrayList<Ip6AddressString> value) {
        this.dnsServerAddresses = value;
    }
    
    
    
    @XmlElement(name="NETWORK-MASK")
    public Ip6AddressString getNetworkMask() {
    return this.networkMask;
}

    public void setNetworkMask(Ip6AddressString value) {
        this.networkMask = value;
    }
    
    
}