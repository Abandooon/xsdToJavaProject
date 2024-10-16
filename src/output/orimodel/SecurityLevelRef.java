package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SecurityLevelRef extends Ref {

    
    
    protected DiagnosticSecurityLevelSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticSecurityLevelSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticSecurityLevelSubtypesEnum value) {
        this.dest = value;
    }
    
    
}