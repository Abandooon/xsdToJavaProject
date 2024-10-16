package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AccessPermissionRef extends Ref {

    
    
    protected DiagnosticAccessPermissionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticAccessPermissionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticAccessPermissionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}