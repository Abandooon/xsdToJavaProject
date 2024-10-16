package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-ECU-PROPS")
public class DiagnosticEcuProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean isObdRelevant;
    
    
    
    protected Boolean sendRespPendOnTransToBoot;
    
    

    
    
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
    
    
    
    @XmlElement(name="IS-OBD-RELEVANT")
    public Boolean getIsObdRelevant() {
    return this.isObdRelevant;
}

    public void setIsObdRelevant(Boolean value) {
        this.isObdRelevant = value;
    }
    
    
    
    @XmlElement(name="SEND-RESP-PEND-ON-TRANS-TO-BOOT")
    public Boolean getSendRespPendOnTransToBoot() {
    return this.sendRespPendOnTransToBoot;
}

    public void setSendRespPendOnTransToBoot(Boolean value) {
        this.sendRespPendOnTransToBoot = value;
    }
    
    
}