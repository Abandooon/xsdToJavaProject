package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Slaves {

    
    
    protected ArrayList<GlobalTimeCanSlave> globalTimeCanSlave;
    
    
    
    protected ArrayList<GlobalTimeEthSlave> globalTimeEthSlave;
    
    
    
    protected ArrayList<GlobalTimeFrSlave> globalTimeFrSlave;
    
    

    
    
    @XmlElement(name="GLOBAL-TIME-CAN-SLAVE")
    public ArrayList<GlobalTimeCanSlave> getGlobalTimeCanSlave() {
    return this.globalTimeCanSlave;
}

    public void setGlobalTimeCanSlave(ArrayList<GlobalTimeCanSlave> value) {
        this.globalTimeCanSlave = value;
    }
    
    
    
    @XmlElement(name="GLOBAL-TIME-ETH-SLAVE")
    public ArrayList<GlobalTimeEthSlave> getGlobalTimeEthSlave() {
    return this.globalTimeEthSlave;
}

    public void setGlobalTimeEthSlave(ArrayList<GlobalTimeEthSlave> value) {
        this.globalTimeEthSlave = value;
    }
    
    
    
    @XmlElement(name="GLOBAL-TIME-FR-SLAVE")
    public ArrayList<GlobalTimeFrSlave> getGlobalTimeFrSlave() {
    return this.globalTimeFrSlave;
}

    public void setGlobalTimeFrSlave(ArrayList<GlobalTimeFrSlave> value) {
        this.globalTimeFrSlave = value;
    }
    
    
}