package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DataTransferClassRef extends Ref {

    
    
    protected DiagnosticDataTransferClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDataTransferClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticDataTransferClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}