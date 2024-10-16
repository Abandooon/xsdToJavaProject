package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReadDtcInformationClassRef extends Ref {

    
    
    protected DiagnosticReadDtcInformationClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticReadDtcInformationClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticReadDtcInformationClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}