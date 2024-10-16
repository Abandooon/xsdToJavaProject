package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RequestUploadClassRef extends Ref {

    
    
    protected DiagnosticRequestUploadClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticRequestUploadClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticRequestUploadClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}