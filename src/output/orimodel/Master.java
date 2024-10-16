package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Master {

    
    
    protected GlobalTimeCanMaster globalTimeCanMaster;
    
    
    
    protected GlobalTimeEthMaster globalTimeEthMaster;
    
    
    
    protected GlobalTimeFrMaster globalTimeFrMaster;
    
    

    
    
    @XmlElement(name="GLOBAL-TIME-CAN-MASTER")
    public GlobalTimeCanMaster getGlobalTimeCanMaster() {
    return this.globalTimeCanMaster;
}

    public void setGlobalTimeCanMaster(GlobalTimeCanMaster value) {
        this.globalTimeCanMaster = value;
    }
    
    
    
    @XmlElement(name="GLOBAL-TIME-ETH-MASTER")
    public GlobalTimeEthMaster getGlobalTimeEthMaster() {
    return this.globalTimeEthMaster;
}

    public void setGlobalTimeEthMaster(GlobalTimeEthMaster value) {
        this.globalTimeEthMaster = value;
    }
    
    
    
    @XmlElement(name="GLOBAL-TIME-FR-MASTER")
    public GlobalTimeFrMaster getGlobalTimeFrMaster() {
    return this.globalTimeFrMaster;
}

    public void setGlobalTimeFrMaster(GlobalTimeFrMaster value) {
        this.globalTimeFrMaster = value;
    }
    
    
}