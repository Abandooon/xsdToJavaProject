package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dnsserveraddresses {

    
    
    protected ArrayList<Ip6AddressString> dnsServerAddresss;
    
    

    
    
    @XmlElement(name="DNS-SERVER-ADDRESS")
    public ArrayList<Ip6AddressString> getDnsServerAddresss() {
        return this.dnsServerAddresss;
    }

    public void setDnsServerAddresss(ArrayList<Ip6AddressString> value) {
        this.dnsServerAddresss = value;
    }
    
    
}