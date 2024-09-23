package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DhcpServerConfiguration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Ipv4DhcpServerConfiguration ipv4DhcpServerConfiguration;
    
    
    
    protected Ipv6DhcpServerConfiguration ipv6DhcpServerConfiguration;
    
    

    
    
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
    
    
    
    @XmlElement(name="IPV-4-DHCP-SERVER-CONFIGURATION")
    public Ipv4DhcpServerConfiguration getIpv4DhcpServerConfiguration() {
        return this.ipv4DhcpServerConfiguration;
    }

    public void setIpv4DhcpServerConfiguration(Ipv4DhcpServerConfiguration value) {
        this.ipv4DhcpServerConfiguration = value;
    }
    
    
    
    @XmlElement(name="IPV-6-DHCP-SERVER-CONFIGURATION")
    public Ipv6DhcpServerConfiguration getIpv6DhcpServerConfiguration() {
        return this.ipv6DhcpServerConfiguration;
    }

    public void setIpv6DhcpServerConfiguration(Ipv6DhcpServerConfiguration value) {
        this.ipv6DhcpServerConfiguration = value;
    }
    
    
}