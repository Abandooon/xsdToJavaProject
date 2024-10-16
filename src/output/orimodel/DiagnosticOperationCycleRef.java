package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagnosticOperationCycleRef extends Ref {

    
    
    protected DiagnosticOperationCycleSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticOperationCycleSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticOperationCycleSubtypesEnum value) {
        this.dest = value;
    }
    
    
}