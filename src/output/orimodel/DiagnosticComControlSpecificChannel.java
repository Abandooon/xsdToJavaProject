package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-COM-CONTROL-SPECIFIC-CHANNEL")
public class DiagnosticComControlSpecificChannel {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SpecificChannelRef specificChannelRef;
    
    
    
    protected PositiveInteger subnetNumber;
    
    

    
    
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
    
    
    
    @XmlElement(name="SPECIFIC-CHANNEL-REF")
    public SpecificChannelRef getSpecificChannelRef() {
    return this.specificChannelRef;
}

    public void setSpecificChannelRef(SpecificChannelRef value) {
        this.specificChannelRef = value;
    }
    
    
    
    @XmlElement(name="SUBNET-NUMBER")
    public PositiveInteger getSubnetNumber() {
    return this.subnetNumber;
}

    public void setSubnetNumber(PositiveInteger value) {
        this.subnetNumber = value;
    }
    
    
}