package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SessionControlClassRef extends Ref {

    
    
    protected DiagnosticSessionControlClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticSessionControlClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticSessionControlClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}