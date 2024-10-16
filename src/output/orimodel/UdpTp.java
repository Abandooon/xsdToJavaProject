package stdgui.data.model.orimodel;
@XmlRootElement(name = "UDP-TP")
public class UdpTp {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TpPort udpTpPort;
    
    

    
    
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
    
    
    
    @XmlElement(name="UDP-TP-PORT")
    public TpPort getUdpTpPort() {
    return this.udpTpPort;
}

    public void setUdpTpPort(TpPort value) {
        this.udpTpPort = value;
    }
    
    
}