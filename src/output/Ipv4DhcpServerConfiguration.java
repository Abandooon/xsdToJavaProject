package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ipv4DhcpServerConfiguration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected AdminData adminData;
    
    
    
    protected Ip4AddressString addressRangeLowerBound;
    
    
    
    protected Ip4AddressString addressRangeUpperBound;
    
    
    
    protected Ip4AddressString defaultGateway;
    
    
    
    protected TimeValue defaultLeaseTime;
    
    
    
    protected DnsServerAddresses dnsServerAddresses;
    
    
    
    protected Ip4AddressString networkMask;
    
    

    
    
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
    public Ip4AddressString getAddressRangeLowerBound() {
        return this.addressRangeLowerBound;
    }

    public void setAddressRangeLowerBound(Ip4AddressString value) {
        this.addressRangeLowerBound = value;
    }
    
    
    
    @XmlElement(name="ADDRESS-RANGE-UPPER-BOUND")
    public Ip4AddressString getAddressRangeUpperBound() {
        return this.addressRangeUpperBound;
    }

    public void setAddressRangeUpperBound(Ip4AddressString value) {
        this.addressRangeUpperBound = value;
    }
    
    
    
    @XmlElement(name="DEFAULT-GATEWAY")
    public Ip4AddressString getDefaultGateway() {
        return this.defaultGateway;
    }

    public void setDefaultGateway(Ip4AddressString value) {
        this.defaultGateway = value;
    }
    
    
    
    @XmlElement(name="DEFAULT-LEASE-TIME")
    public TimeValue getDefaultLeaseTime() {
        return this.defaultLeaseTime;
    }

    public void setDefaultLeaseTime(TimeValue value) {
        this.defaultLeaseTime = value;
    }
    
    
    
    @XmlElement(name="DNS-SERVER-ADDRESSES")
    public DnsServerAddresses getDnsServerAddresses() {
        return this.dnsServerAddresses;
    }

    public void setDnsServerAddresses(DnsServerAddresses value) {
        this.dnsServerAddresses = value;
    }
    
    
    
    @XmlElement(name="NETWORK-MASK")
    public Ip4AddressString getNetworkMask() {
        return this.networkMask;
    }

    public void setNetworkMask(Ip4AddressString value) {
        this.networkMask = value;
    }
    
    
}