package stdgui.data.model.orimodel;
@XmlRootElement(name = "CAN-NM-ECU")
public class CanNmEcu {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean nmRepeatMsgIndicationEnabled;
    
    

    
    
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
    
    
    
    @XmlElement(name="NM-REPEAT-MSG-INDICATION-ENABLED")
    public Boolean getNmRepeatMsgIndicationEnabled() {
    return this.nmRepeatMsgIndicationEnabled;
}

    public void setNmRepeatMsgIndicationEnabled(Boolean value) {
        this.nmRepeatMsgIndicationEnabled = value;
    }
    
    
}