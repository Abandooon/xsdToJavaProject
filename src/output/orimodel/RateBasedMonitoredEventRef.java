package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RateBasedMonitoredEventRef extends Ref {

    
    
    protected DiagnosticEventNeedsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticEventNeedsSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticEventNeedsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}