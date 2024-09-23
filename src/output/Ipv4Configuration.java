package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ipv4Configuration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger assignmentPriority;
    
    
    
    protected Ip4AddressString defaultGateway;
    
    
    
    protected DnsServerAddresses dnsServerAddresses;
    
    
    
    protected IpAddressKeepEnum ipAddressKeepBehavior;
    
    
    
    protected Ip4AddressString ipv4Address;
    
    
    
    protected Ipv4AddressSourceEnum ipv4AddressSource;
    
    
    
    protected Ip4AddressString networkMask;
    
    
    
    protected PositiveInteger ttl;
    
    

    
    
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
    
    
    
    @XmlElement(name="DEFAULT-GATEWAY")
    public Ip4AddressString getDefaultGateway() {
        return this.defaultGateway;
    }

    public void setDefaultGateway(Ip4AddressString value) {
        this.defaultGateway = value;
    }
    
    
    
    @XmlElement(name="DNS-SERVER-ADDRESSES")
    public DnsServerAddresses getDnsServerAddresses() {
        return this.dnsServerAddresses;
    }

    public void setDnsServerAddresses(DnsServerAddresses value) {
        this.dnsServerAddresses = value;
    }
    
    
    
    @XmlElement(name="IP-ADDRESS-KEEP-BEHAVIOR")
    public IpAddressKeepEnum getIpAddressKeepBehavior() {
        return this.ipAddressKeepBehavior;
    }

    public void setIpAddressKeepBehavior(IpAddressKeepEnum value) {
        this.ipAddressKeepBehavior = value;
    }
    
    
    
    @XmlElement(name="IPV-4-ADDRESS")
    public Ip4AddressString getIpv4Address() {
        return this.ipv4Address;
    }

    public void setIpv4Address(Ip4AddressString value) {
        this.ipv4Address = value;
    }
    
    
    
    @XmlElement(name="IPV-4-ADDRESS-SOURCE")
    public Ipv4AddressSourceEnum getIpv4AddressSource() {
        return this.ipv4AddressSource;
    }

    public void setIpv4AddressSource(Ipv4AddressSourceEnum value) {
        this.ipv4AddressSource = value;
    }
    
    
    
    @XmlElement(name="NETWORK-MASK")
    public Ip4AddressString getNetworkMask() {
        return this.networkMask;
    }

    public void setNetworkMask(Ip4AddressString value) {
        this.networkMask = value;
    }
    
    
    
    @XmlElement(name="TTL")
    public PositiveInteger getTtl() {
        return this.ttl;
    }

    public void setTtl(PositiveInteger value) {
        this.ttl = value;
    }
    
    
}