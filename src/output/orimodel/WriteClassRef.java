package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class WriteClassRef extends Ref {

    
    
    protected DiagnosticWriteDataByIdentifierClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticWriteDataByIdentifierClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticWriteDataByIdentifierClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}