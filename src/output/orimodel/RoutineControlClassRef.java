package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RoutineControlClassRef extends Ref {

    
    
    protected DiagnosticRoutineControlClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticRoutineControlClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticRoutineControlClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}