package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class MemoryDestinationRef extends Ref {

    
    
    protected DiagnosticMemoryDestinationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticMemoryDestinationSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticMemoryDestinationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}