package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ResponseOnEventClassRef extends Ref {

    
    
    protected DiagnosticResponseOnEventClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticResponseOnEventClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticResponseOnEventClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}