package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TpConfiguration {

    
    
    protected GenericTp genericTp;
    
    
    
    protected HttpTp httpTp;
    
    
    
    protected Ieee1722Tp ieee1722Tp;
    
    
    
    protected RtpTp rtpTp;
    
    
    
    protected TcpTp tcpTp;
    
    
    
    protected UdpTp udpTp;
    
    

    
    
    @XmlElement(name="GENERIC-TP")
    public GenericTp getGenericTp() {
    return this.genericTp;
}

    public void setGenericTp(GenericTp value) {
        this.genericTp = value;
    }
    
    
    
    @XmlElement(name="HTTP-TP")
    public HttpTp getHttpTp() {
    return this.httpTp;
}

    public void setHttpTp(HttpTp value) {
        this.httpTp = value;
    }
    
    
    
    @XmlElement(name="IEEE-1722-TP")
    public Ieee1722Tp getIeee1722Tp() {
    return this.ieee1722Tp;
}

    public void setIeee1722Tp(Ieee1722Tp value) {
        this.ieee1722Tp = value;
    }
    
    
    
    @XmlElement(name="RTP-TP")
    public RtpTp getRtpTp() {
    return this.rtpTp;
}

    public void setRtpTp(RtpTp value) {
        this.rtpTp = value;
    }
    
    
    
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