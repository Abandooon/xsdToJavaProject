package stdgui.data.model.orimodel;
@XmlRootElement(name = "TRANSMISSION-MODE-DECLARATION")
public class TransmissionModeDeclaration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ModeDrivenTransmissionModeCondition> modeDrivenFalseConditions;
    
    
    
    protected ArrayList<ModeDrivenTransmissionModeCondition> modeDrivenTrueConditions;
    
    
    
    protected ArrayList<TransmissionModeCondition> transmissionModeConditions;
    
    
    
    protected TransmissionModeTiming transmissionModeFalseTiming;
    
    
    
    protected TransmissionModeTiming transmissionModeTrueTiming;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="MODE-DRIVEN-FALSE-CONDITIONS")
@XmlElement(name="MODE-DRIVEN-TRANSMISSION-MODE-CONDITION")
    public ArrayList<ModeDrivenTransmissionModeCondition> getModeDrivenFalseConditions() {
    return this.modeDrivenFalseConditions;
}

    public void setModeDrivenFalseConditions(ArrayList<ModeDrivenTransmissionModeCondition> value) {
        this.modeDrivenFalseConditions = value;
    }
    
    
    
    @XmlElementWrapper(name="MODE-DRIVEN-TRUE-CONDITIONS")
@XmlElement(name="MODE-DRIVEN-TRANSMISSION-MODE-CONDITION")
    public ArrayList<ModeDrivenTransmissionModeCondition> getModeDrivenTrueConditions() {
    return this.modeDrivenTrueConditions;
}

    public void setModeDrivenTrueConditions(ArrayList<ModeDrivenTransmissionModeCondition> value) {
        this.modeDrivenTrueConditions = value;
    }
    
    
    
    @XmlElementWrapper(name="TRANSMISSION-MODE-CONDITIONS")
@XmlElement(name="TRANSMISSION-MODE-CONDITION")
    public ArrayList<TransmissionModeCondition> getTransmissionModeConditions() {
    return this.transmissionModeConditions;
}

    public void setTransmissionModeConditions(ArrayList<TransmissionModeCondition> value) {
        this.transmissionModeConditions = value;
    }
    
    
    
    @XmlElement(name="TRANSMISSION-MODE-FALSE-TIMING")
    public TransmissionModeTiming getTransmissionModeFalseTiming() {
    return this.transmissionModeFalseTiming;
}

    public void setTransmissionModeFalseTiming(TransmissionModeTiming value) {
        this.transmissionModeFalseTiming = value;
    }
    
    
    
    @XmlElement(name="TRANSMISSION-MODE-TRUE-TIMING")
    public TransmissionModeTiming getTransmissionModeTrueTiming() {
    return this.transmissionModeTrueTiming;
}

    public void setTransmissionModeTrueTiming(TransmissionModeTiming value) {
        this.transmissionModeTrueTiming = value;
    }
    
    
}