package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class IndicatorRef extends Ref {

    
    
    protected DiagnosticIndicatorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticIndicatorSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticIndicatorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}