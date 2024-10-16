package stdgui.data.model.orimodel;
@XmlRootElement(name = "J-1939-TP-PG")
public class J1939TpPg {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DirectPduRef directPduRef;
    
    
    
    protected Integer pgn;
    
    
    
    protected Boolean requestable;
    
    
    
    protected ArrayList<SduRef> sduRefs;
    
    
    
    protected TpSduRef_CanTpConnection tpSduRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="DIRECT-PDU-REF")
    public DirectPduRef getDirectPduRef() {
    return this.directPduRef;
}

    public void setDirectPduRef(DirectPduRef value) {
        this.directPduRef = value;
    }
    
    
    
    @XmlElement(name="PGN")
    public Integer getPgn() {
    return this.pgn;
}

    public void setPgn(Integer value) {
        this.pgn = value;
    }
    
    
    
    @XmlElement(name="REQUESTABLE")
    public Boolean getRequestable() {
    return this.requestable;
}

    public void setRequestable(Boolean value) {
        this.requestable = value;
    }
    
    
    
    @XmlElementWrapper(name="SDU-REFS")
@XmlElement(name="SDU-REF")
    public ArrayList<SduRef> getSduRefs() {
    return this.sduRefs;
}

    public void setSduRefs(ArrayList<SduRef> value) {
        this.sduRefs = value;
    }
    
    
    
    @XmlElement(name="TP-SDU-REF")
    public TpSduRef_CanTpConnection getTpSduRef() {
    return this.tpSduRef;
}

    public void setTpSduRef(TpSduRef_CanTpConnection value) {
        this.tpSduRef = value;
    }
    
    
}