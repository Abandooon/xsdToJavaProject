package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-COM-CONTROL-SUB-NODE-CHANNEL")
public class DiagnosticComControlSubNodeChannel {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SubNodeChannelRef subNodeChannelRef;
    
    
    
    protected PositiveInteger subNodeNumber;
    
    

    
    
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
    
    
    
    @XmlElement(name="SUB-NODE-CHANNEL-REF")
    public SubNodeChannelRef getSubNodeChannelRef() {
    return this.subNodeChannelRef;
}

    public void setSubNodeChannelRef(SubNodeChannelRef value) {
        this.subNodeChannelRef = value;
    }
    
    
    
    @XmlElement(name="SUB-NODE-NUMBER")
    public PositiveInteger getSubNodeNumber() {
    return this.subNodeNumber;
}

    public void setSubNodeNumber(PositiveInteger value) {
        this.subNodeNumber = value;
    }
    
    
}