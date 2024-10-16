package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CommControllers {

    
    
    protected ArrayList<CanCommunicationController> canCommunicationController;
    
    
    
    protected ArrayList<EthernetCommunicationController> ethernetCommunicationController;
    
    
    
    protected ArrayList<FlexrayCommunicationController> flexrayCommunicationController;
    
    
    
    protected ArrayList<LinMaster> linMaster;
    
    
    
    protected ArrayList<LinSlave> linSlave;
    
    
    
    protected ArrayList<TtcanCommunicationController> ttcanCommunicationController;
    
    
    
    protected ArrayList<UserDefinedCommunicationController> userDefinedCommunicationController;
    
    

    
    
    @XmlElement(name="CAN-COMMUNICATION-CONTROLLER")
    public ArrayList<CanCommunicationController> getCanCommunicationController() {
    return this.canCommunicationController;
}

    public void setCanCommunicationController(ArrayList<CanCommunicationController> value) {
        this.canCommunicationController = value;
    }
    
    
    
    @XmlElement(name="ETHERNET-COMMUNICATION-CONTROLLER")
    public ArrayList<EthernetCommunicationController> getEthernetCommunicationController() {
    return this.ethernetCommunicationController;
}

    public void setEthernetCommunicationController(ArrayList<EthernetCommunicationController> value) {
        this.ethernetCommunicationController = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-COMMUNICATION-CONTROLLER")
    public ArrayList<FlexrayCommunicationController> getFlexrayCommunicationController() {
    return this.flexrayCommunicationController;
}

    public void setFlexrayCommunicationController(ArrayList<FlexrayCommunicationController> value) {
        this.flexrayCommunicationController = value;
    }
    
    
    
    @XmlElement(name="LIN-MASTER")
    public ArrayList<LinMaster> getLinMaster() {
    return this.linMaster;
}

    public void setLinMaster(ArrayList<LinMaster> value) {
        this.linMaster = value;
    }
    
    
    
    @XmlElement(name="LIN-SLAVE")
    public ArrayList<LinSlave> getLinSlave() {
    return this.linSlave;
}

    public void setLinSlave(ArrayList<LinSlave> value) {
        this.linSlave = value;
    }
    
    
    
    @XmlElement(name="TTCAN-COMMUNICATION-CONTROLLER")
    public ArrayList<TtcanCommunicationController> getTtcanCommunicationController() {
    return this.ttcanCommunicationController;
}

    public void setTtcanCommunicationController(ArrayList<TtcanCommunicationController> value) {
        this.ttcanCommunicationController = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-COMMUNICATION-CONTROLLER")
    public ArrayList<UserDefinedCommunicationController> getUserDefinedCommunicationController() {
    return this.userDefinedCommunicationController;
}

    public void setUserDefinedCommunicationController(ArrayList<UserDefinedCommunicationController> value) {
        this.userDefinedCommunicationController = value;
    }
    
    
}