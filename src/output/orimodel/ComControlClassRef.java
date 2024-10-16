package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ComControlClassRef extends Ref {

    
    
    protected DiagnosticComControlClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticComControlClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticComControlClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}