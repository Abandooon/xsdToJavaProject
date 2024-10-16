package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagnosticServiceTableRef extends Ref {

    
    
    protected DiagnosticServiceTableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticServiceTableSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticServiceTableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}