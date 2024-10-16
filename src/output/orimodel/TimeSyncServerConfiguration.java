package stdgui.data.model.orimodel;
@XmlRootElement(name = "TIME-SYNC-SERVER-CONFIGURATION")
public class TimeSyncServerConfiguration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected PositiveInteger priority;
    
    
    
    protected TimeValue syncInterval;
    
    
    
    protected String timeSyncServerIdentifier;
    
    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
    return this.shortName;
}

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="PRIORITY")
    public PositiveInteger getPriority() {
    return this.priority;
}

    public void setPriority(PositiveInteger value) {
        this.priority = value;
    }
    
    
    
    @XmlElement(name="SYNC-INTERVAL")
    public TimeValue getSyncInterval() {
    return this.syncInterval;
}

    public void setSyncInterval(TimeValue value) {
        this.syncInterval = value;
    }
    
    
    
    @XmlElement(name="TIME-SYNC-SERVER-IDENTIFIER")
    public String getTimeSyncServerIdentifier() {
    return this.timeSyncServerIdentifier;
}

    public void setTimeSyncServerIdentifier(String value) {
        this.timeSyncServerIdentifier = value;
    }
    
    
    
    @XmlElement(name="TIME-SYNC-TECHNOLOGY")
    public TimeSyncTechnologyEnum getTimeSyncTechnology() {
    return this.timeSyncTechnology;
}

    public void setTimeSyncTechnology(TimeSyncTechnologyEnum value) {
        this.timeSyncTechnology = value;
    }
    
    
}