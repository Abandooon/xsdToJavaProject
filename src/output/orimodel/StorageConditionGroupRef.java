package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class StorageConditionGroupRef extends Ref {

    
    
    protected DiagnosticStorageConditionGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticStorageConditionGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticStorageConditionGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}