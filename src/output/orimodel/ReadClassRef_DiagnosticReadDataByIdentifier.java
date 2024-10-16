package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReadClassRef_DiagnosticReadDataByIdentifier extends Ref {

    
    
    protected DiagnosticReadDataByIdentifierClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticReadDataByIdentifierClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticReadDataByIdentifierClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}