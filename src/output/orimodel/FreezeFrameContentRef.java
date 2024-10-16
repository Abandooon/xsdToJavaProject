package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FreezeFrameContentRef extends Ref {

    
    
    protected DiagnosticDataIdentifierSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDataIdentifierSetSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticDataIdentifierSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}