package stdgui.data.model.orimodel;
@XmlRootElement(name = "HTTP-TP")
public class HttpTp {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String contentType;
    
    
    
    protected String protocolVersion;
    
    
    
    protected RequestMethodEnum requestMethod;
    
    
    
    protected TcpTp tcpTpConfig;
    
    
    
    protected UriString uri;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTENT-TYPE")
    public String getContentType() {
    return this.contentType;
}

    public void setContentType(String value) {
        this.contentType = value;
    }
    
    
    
    @XmlElement(name="PROTOCOL-VERSION")
    public String getProtocolVersion() {
    return this.protocolVersion;
}

    public void setProtocolVersion(String value) {
        this.protocolVersion = value;
    }
    
    
    
    @XmlElement(name="REQUEST-METHOD")
    public RequestMethodEnum getRequestMethod() {
    return this.requestMethod;
}

    public void setRequestMethod(RequestMethodEnum value) {
        this.requestMethod = value;
    }
    
    
    
    @XmlElement(name="TCP-TP-CONFIG")
    public TcpTp getTcpTpConfig() {
    return this.tcpTpConfig;
}

    public void setTcpTpConfig(TcpTp value) {
        this.tcpTpConfig = value;
    }
    
    
    
    @XmlElement(name="URI")
    public UriString getUri() {
    return this.uri;
}

    public void setUri(UriString value) {
        this.uri = value;
    }
    
    
}