package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagnosticConnectionRef extends Ref {

    
    
    protected DiagnosticConnectionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticConnectionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticConnectionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}