package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Events_DiagnosticResponseOnEvent {

    
    
    protected ArrayList<DiagnosticDataChangeTrigger> diagnosticDataChangeTrigger;
    
    
    
    protected ArrayList<DiagnosticDtcChangeTrigger> diagnosticDtcChangeTrigger;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-DATA-CHANGE-TRIGGER")
    public ArrayList<DiagnosticDataChangeTrigger> getDiagnosticDataChangeTrigger() {
    return this.diagnosticDataChangeTrigger;
}

    public void setDiagnosticDataChangeTrigger(ArrayList<DiagnosticDataChangeTrigger> value) {
        this.diagnosticDataChangeTrigger = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-DTC-CHANGE-TRIGGER")
    public ArrayList<DiagnosticDtcChangeTrigger> getDiagnosticDtcChangeTrigger() {
    return this.diagnosticDtcChangeTrigger;
}

    public void setDiagnosticDtcChangeTrigger(ArrayList<DiagnosticDtcChangeTrigger> value) {
        this.diagnosticDtcChangeTrigger = value;
    }
    
    
}