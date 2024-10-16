package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RequestDownloadClassRef extends Ref {

    
    
    protected DiagnosticRequestDownloadClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticRequestDownloadClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticRequestDownloadClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}