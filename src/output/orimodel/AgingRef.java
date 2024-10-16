package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AgingRef extends Ref {

    
    
    protected DiagnosticAgingSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticAgingSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticAgingSubtypesEnum value) {
        this.dest = value;
    }
    
    
}