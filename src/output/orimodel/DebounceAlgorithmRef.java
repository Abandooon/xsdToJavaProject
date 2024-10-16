package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DebounceAlgorithmRef extends Ref {

    
    
    protected DiagnosticDebounceAlgorithmPropsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDebounceAlgorithmPropsSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticDebounceAlgorithmPropsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}