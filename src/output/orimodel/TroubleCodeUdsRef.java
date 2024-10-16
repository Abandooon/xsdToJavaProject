package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TroubleCodeUdsRef extends Ref {

    
    
    protected DiagnosticTroubleCodeUdsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticTroubleCodeUdsSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticTroubleCodeUdsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}