package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagnosticTroubleCodeRef extends Ref {

    
    
    protected DiagnosticTroubleCodeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticTroubleCodeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticTroubleCodeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}