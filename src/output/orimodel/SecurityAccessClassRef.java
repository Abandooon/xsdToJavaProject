package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SecurityAccessClassRef extends Ref {

    
    
    protected DiagnosticSecurityAccessClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticSecurityAccessClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticSecurityAccessClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}