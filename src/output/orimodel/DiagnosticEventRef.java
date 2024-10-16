package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagnosticEventRef extends Ref {

    
    
    protected DiagnosticEventSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticEventSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticEventSubtypesEnum value) {
        this.dest = value;
    }
    
    
}