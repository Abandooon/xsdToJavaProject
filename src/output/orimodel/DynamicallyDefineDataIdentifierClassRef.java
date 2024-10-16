package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DynamicallyDefineDataIdentifierClassRef extends Ref {

    
    
    protected DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}