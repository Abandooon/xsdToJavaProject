package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DataIdentifierRef extends Ref {

    
    
    protected DiagnosticDataIdentifierSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDataIdentifierSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticDataIdentifierSubtypesEnum value) {
        this.dest = value;
    }
    
    
}