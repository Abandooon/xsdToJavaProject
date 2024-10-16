package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-DTC-CHANGE-TRIGGER")
public class DiagnosticDtcChangeTrigger {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiagnosticInitialEventStatusEnum initialEventStatus;
    
    

    
    
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
    
    
}