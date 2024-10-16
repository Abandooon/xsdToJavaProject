package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TcpUdpConfig {

    
    
    protected TcpTp tcpTp;
    
    
    
    protected UdpTp udpTp;
    
    

    
    
    @XmlElement(name="TCP-TP")
    public TcpTp getTcpTp() {
    return this.tcpTp;
}

    public void setTcpTp(TcpTp value) {
        this.tcpTp = value;
    }
    
    
    
    @XmlElement(name="UDP-TP")
    public UdpTp getUdpTp() {
    return this.udpTp;
}

    public void setUdpTp(UdpTp value) {
        this.udpTp = value;
    }
    
    
}