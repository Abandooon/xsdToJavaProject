package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagnosticSessionRef extends Ref {

    
    
    protected DiagnosticSessionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticSessionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticSessionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}