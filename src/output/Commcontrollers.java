package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Commcontrollers {

    
    
    protected ArrayList<CanCommunicationController> canCommunicationControllers;
    
    
    
    protected ArrayList<EthernetCommunicationController> ethernetCommunicationControllers;
    
    
    
    protected ArrayList<FlexrayCommunicationController> flexrayCommunicationControllers;
    
    
    
    protected ArrayList<LinMaster> linMasters;
    
    
    
    protected ArrayList<LinSlave> linSlaves;
    
    
    
    protected ArrayList<TtcanCommunicationController> ttcanCommunicationControllers;
    
    
    
    protected ArrayList<UserDefinedCommunicationController> userDefinedCommunicationControllers;
    
    

    
    
    @XmlElement(name="CAN-COMMUNICATION-CONTROLLER")
    public ArrayList<CanCommunicationController> getCanCommunicationControllers() {
        return this.canCommunicationControllers;
    }

    public void setCanCommunicationControllers(ArrayList<CanCommunicationController> value) {
        this.canCommunicationControllers = value;
    }
    
    
    
    @XmlElement(name="ETHERNET-COMMUNICATION-CONTROLLER")
    public ArrayList<EthernetCommunicationController> getEthernetCommunicationControllers() {
        return this.ethernetCommunicationControllers;
    }

    public void setEthernetCommunicationControllers(ArrayList<EthernetCommunicationController> value) {
        this.ethernetCommunicationControllers = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-COMMUNICATION-CONTROLLER")
    public ArrayList<FlexrayCommunicationController> getFlexrayCommunicationControllers() {
        return this.flexrayCommunicationControllers;
    }

    public void setFlexrayCommunicationControllers(ArrayList<FlexrayCommunicationController> value) {
        this.flexrayCommunicationControllers = value;
    }
    
    
    
    @XmlElement(name="LIN-MASTER")
    public ArrayList<LinMaster> getLinMasters() {
        return this.linMasters;
    }

    public void setLinMasters(ArrayList<LinMaster> value) {
        this.linMasters = value;
    }
    
    
    
    @XmlElement(name="LIN-SLAVE")
    public ArrayList<LinSlave> getLinSlaves() {
        return this.linSlaves;
    }

    public void setLinSlaves(ArrayList<LinSlave> value) {
        this.linSlaves = value;
    }
    
    
    
    @XmlElement(name="TTCAN-COMMUNICATION-CONTROLLER")
    public ArrayList<TtcanCommunicationController> getTtcanCommunicationControllers() {
        return this.ttcanCommunicationControllers;
    }

    public void setTtcanCommunicationControllers(ArrayList<TtcanCommunicationController> value) {
        this.ttcanCommunicationControllers = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-COMMUNICATION-CONTROLLER")
    public ArrayList<UserDefinedCommunicationController> getUserDefinedCommunicationControllers() {
        return this.userDefinedCommunicationControllers;
    }

    public void setUserDefinedCommunicationControllers(ArrayList<UserDefinedCommunicationController> value) {
        this.userDefinedCommunicationControllers = value;
    }
    
    
}