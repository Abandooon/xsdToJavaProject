package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Networkendpointaddresses {

    
    
    protected ArrayList<Ipv4Configuration> ipv4Configurations;
    
    
    
    protected ArrayList<Ipv6Configuration> ipv6Configurations;
    
    
    
    protected ArrayList<MacMulticastConfiguration> macMulticastConfigurations;
    
    

    
    
    @XmlElement(name="IPV-4-CONFIGURATION")
    public ArrayList<Ipv4Configuration> getIpv4Configurations() {
        return this.ipv4Configurations;
    }

    public void setIpv4Configurations(ArrayList<Ipv4Configuration> value) {
        this.ipv4Configurations = value;
    }
    
    
    
    @XmlElement(name="IPV-6-CONFIGURATION")
    public ArrayList<Ipv6Configuration> getIpv6Configurations() {
        return this.ipv6Configurations;
    }

    public void setIpv6Configurations(ArrayList<Ipv6Configuration> value) {
        this.ipv6Configurations = value;
    }
    
    
    
    @XmlElement(name="MAC-MULTICAST-CONFIGURATION")
    public ArrayList<MacMulticastConfiguration> getMacMulticastConfigurations() {
        return this.macMulticastConfigurations;
    }

    public void setMacMulticastConfigurations(ArrayList<MacMulticastConfiguration> value) {
        this.macMulticastConfigurations = value;
    }
    
    
}