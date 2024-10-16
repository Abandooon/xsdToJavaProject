package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagnosticExtendedDataRecordRef extends Ref {

    
    
    protected DiagnosticExtendedDataRecordSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticExtendedDataRecordSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticExtendedDataRecordSubtypesEnum value) {
        this.dest = value;
    }
    
    
}