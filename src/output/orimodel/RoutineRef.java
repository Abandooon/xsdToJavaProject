package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RoutineRef extends Ref {

    
    
    protected DiagnosticRoutineSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticRoutineSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticRoutineSubtypesEnum value) {
        this.dest = value;
    }
    
    
}