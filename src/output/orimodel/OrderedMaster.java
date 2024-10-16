package stdgui.data.model.orimodel;
@XmlRootElement(name = "ORDERED-MASTER")
public class OrderedMaster {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger index;
    
    
    
    protected TimeSyncServerRef timeSyncServerRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="INDEX")
    public PositiveInteger getIndex() {
    return this.index;
}

    public void setIndex(PositiveInteger value) {
        this.index = value;
    }
    
    
    
    @XmlElement(name="TIME-SYNC-SERVER-REF")
    public TimeSyncServerRef getTimeSyncServerRef() {
    return this.timeSyncServerRef;
}

    public void setTimeSyncServerRef(TimeSyncServerRef value) {
        this.timeSyncServerRef = value;
    }
    
    
}