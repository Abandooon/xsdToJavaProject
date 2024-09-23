package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class VlanMembership {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger defaultPriority;
    
    
    
    protected DhcpServerConfiguration dhcpAddressAssignment;
    
    
    
    protected EthernetSwitchVlanEgressTaggingEnum sendActivity;
    
    
    
    protected VlanRef vlanRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="DEFAULT-PRIORITY")
    public PositiveInteger getDefaultPriority() {
        return this.defaultPriority;
    }

    public void setDefaultPriority(PositiveInteger value) {
        this.defaultPriority = value;
    }
    
    
    
    @XmlElement(name="DHCP-ADDRESS-ASSIGNMENT")
    public DhcpServerConfiguration getDhcpAddressAssignment() {
        return this.dhcpAddressAssignment;
    }

    public void setDhcpAddressAssignment(DhcpServerConfiguration value) {
        this.dhcpAddressAssignment = value;
    }
    
    
    
    @XmlElement(name="SEND-ACTIVITY")
    public EthernetSwitchVlanEgressTaggingEnum getSendActivity() {
        return this.sendActivity;
    }

    public void setSendActivity(EthernetSwitchVlanEgressTaggingEnum value) {
        this.sendActivity = value;
    }
    
    
    
    @XmlElement(name="VLAN-REF")
    public VlanRef getVlanRef() {
        return this.vlanRef;
    }

    public void setVlanRef(VlanRef value) {
        this.vlanRef = value;
    }
    
    
}