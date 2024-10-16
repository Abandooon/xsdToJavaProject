package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RequestFileTransferClassRef extends Ref {

    
    
    protected DiagnosticRequestFileTransferClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticRequestFileTransferClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticRequestFileTransferClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}