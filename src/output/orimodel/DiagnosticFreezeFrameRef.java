package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagnosticFreezeFrameRef extends Ref {

    
    
    protected DiagnosticFreezeFrameSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticFreezeFrameSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticFreezeFrameSubtypesEnum value) {
        this.dest = value;
    }
    
    
}