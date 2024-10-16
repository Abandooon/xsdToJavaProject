package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TransferExitClassRef extends Ref {

    
    
    protected DiagnosticTransferExitClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticTransferExitClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticTransferExitClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}