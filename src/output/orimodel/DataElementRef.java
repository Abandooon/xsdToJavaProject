package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DataElementRef extends Ref {

    
    
    protected DiagnosticDataElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDataElementSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticDataElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}