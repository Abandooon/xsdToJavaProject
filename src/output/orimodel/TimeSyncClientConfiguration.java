package stdgui.data.model.orimodel;
@XmlRootElement(name = "TIME-SYNC-CLIENT-CONFIGURATION")
public class TimeSyncClientConfiguration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<OrderedMaster> orderedMasterList;
    
    
    
    protected TimeSyncTechnologyEnum timeSyncTechnology;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="ORDERED-MASTER-LIST")
@XmlElement(name="ORDERED-MASTER")
    public ArrayList<OrderedMaster> getOrderedMasterList() {
    return this.orderedMasterList;
}

    public void setOrderedMasterList(ArrayList<OrderedMaster> value) {
        this.orderedMasterList = value;
    }
    
    
    
    @XmlElement(name="TIME-SYNC-TECHNOLOGY")
    public TimeSyncTechnologyEnum getTimeSyncTechnology() {
    return this.timeSyncTechnology;
}

    public void setTimeSyncTechnology(TimeSyncTechnologyEnum value) {
        this.timeSyncTechnology = value;
    }
    
    
}