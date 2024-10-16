package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagnosticStorageConditionRef extends Ref {

    
    
    protected DiagnosticStorageConditionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticStorageConditionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticStorageConditionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}