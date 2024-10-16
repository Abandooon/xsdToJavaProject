package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CurrentValueRef extends Ref {

    
    
    protected DiagnosticValueNeedsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticValueNeedsSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticValueNeedsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}