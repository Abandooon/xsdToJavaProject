package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FlexrayNmEcu {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean nmHwVoteEnabled;
    
    
    
    protected Boolean nmMainFunctionAcrossFrCycle;
    
    
    
    protected Boolean nmRepeatMessageBitEnable;
    
    

    
    
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
    
    
    
    @XmlElement(name="NM-HW-VOTE-ENABLED")
    public Boolean getNmHwVoteEnabled() {
        return this.nmHwVoteEnabled;
    }

    public void setNmHwVoteEnabled(Boolean value) {
        this.nmHwVoteEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-MAIN-FUNCTION-ACROSS-FR-CYCLE")
    public Boolean getNmMainFunctionAcrossFrCycle() {
        return this.nmMainFunctionAcrossFrCycle;
    }

    public void setNmMainFunctionAcrossFrCycle(Boolean value) {
        this.nmMainFunctionAcrossFrCycle = value;
    }
    
    
    
    @XmlElement(name="NM-REPEAT-MESSAGE-BIT-ENABLE")
    public Boolean getNmRepeatMessageBitEnable() {
        return this.nmRepeatMessageBitEnable;
    }

    public void setNmRepeatMessageBitEnable(Boolean value) {
        this.nmRepeatMessageBitEnable = value;
    }
    
    
}