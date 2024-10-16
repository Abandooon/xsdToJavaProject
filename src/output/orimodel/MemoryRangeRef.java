package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class MemoryRangeRef extends Ref {

    
    
    protected DiagnosticMemoryIdentifierSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticMemoryIdentifierSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticMemoryIdentifierSubtypesEnum value) {
        this.dest = value;
    }
    
    
}