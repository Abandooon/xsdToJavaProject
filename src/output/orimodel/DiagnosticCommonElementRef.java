package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagnosticCommonElementRef extends Ref {

    
    
    protected DiagnosticCommonElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticCommonElementSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticCommonElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}