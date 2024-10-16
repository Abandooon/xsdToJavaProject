package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-DATA-CHANGE-TRIGGER")
public class DiagnosticDataChangeTrigger {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiagnosticInitialEventStatusEnum initialEventStatus;
    
    
    
    protected DataIdentifierRef dataIdentifierRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="INITIAL-EVENT-STATUS")
    public DiagnosticInitialEventStatusEnum getInitialEventStatus() {
    return this.initialEventStatus;
}

    public void setInitialEventStatus(DiagnosticInitialEventStatusEnum value) {
        this.initialEventStatus = value;
    }
    
    
    
    @XmlElement(name="DATA-IDENTIFIER-REF")
    public DataIdentifierRef getDataIdentifierRef() {
    return this.dataIdentifierRef;
}

    public void setDataIdentifierRef(DataIdentifierRef value) {
        this.dataIdentifierRef = value;
    }
    
    
}