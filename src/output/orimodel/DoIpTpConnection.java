package stdgui.data.model.orimodel;
@XmlRootElement(name = "DO-IP-TP-CONNECTION")
public class DoIpTpConnection {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TpConnectionIdent ident;
    
    
    
    protected DoIpSourceAddressRef doIpSourceAddressRef;
    
    
    
    protected DoIpTargetAddressRef doIpTargetAddressRef;
    
    
    
    protected TpSduRef tpSduRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="IDENT")
    public TpConnectionIdent getIdent() {
    return this.ident;
}

    public void setIdent(TpConnectionIdent value) {
        this.ident = value;
    }
    
    
    
    @XmlElement(name="DO-IP-SOURCE-ADDRESS-REF")
    public DoIpSourceAddressRef getDoIpSourceAddressRef() {
    return this.doIpSourceAddressRef;
}

    public void setDoIpSourceAddressRef(DoIpSourceAddressRef value) {
        this.doIpSourceAddressRef = value;
    }
    
    
    
    @XmlElement(name="DO-IP-TARGET-ADDRESS-REF")
    public DoIpTargetAddressRef getDoIpTargetAddressRef() {
    return this.doIpTargetAddressRef;
}

    public void setDoIpTargetAddressRef(DoIpTargetAddressRef value) {
        this.doIpTargetAddressRef = value;
    }
    
    
    
    @XmlElement(name="TP-SDU-REF")
    public TpSduRef getTpSduRef() {
    return this.tpSduRef;
}

    public void setTpSduRef(TpSduRef value) {
        this.tpSduRef = value;
    }
    
    
}