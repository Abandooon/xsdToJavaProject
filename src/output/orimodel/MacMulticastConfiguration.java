package stdgui.data.model.orimodel;
@XmlRootElement(name = "MAC-MULTICAST-CONFIGURATION")
public class MacMulticastConfiguration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MacMulticastGroupRef macMulticastGroupRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="MAC-MULTICAST-GROUP-REF")
    public MacMulticastGroupRef getMacMulticastGroupRef() {
    return this.macMulticastGroupRef;
}

    public void setMacMulticastGroupRef(MacMulticastGroupRef value) {
        this.macMulticastGroupRef = value;
    }
    
    
}