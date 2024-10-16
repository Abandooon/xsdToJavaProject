package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ClearDiagnosticInformationClassRef extends Ref {

    
    
    protected DiagnosticClearDiagnosticInformationClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticClearDiagnosticInformationClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticClearDiagnosticInformationClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}