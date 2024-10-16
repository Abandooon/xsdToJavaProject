package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier extends Ref {

    
    
    protected DiagnosticDynamicDataIdentifierSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDynamicDataIdentifierSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticDynamicDataIdentifierSubtypesEnum value) {
        this.dest = value;
    }
    
    
}