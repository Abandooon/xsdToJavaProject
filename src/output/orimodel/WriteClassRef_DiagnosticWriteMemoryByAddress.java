package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class WriteClassRef_DiagnosticWriteMemoryByAddress extends Ref {

    
    
    protected DiagnosticWriteMemoryByAddressClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticWriteMemoryByAddressClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticWriteMemoryByAddressClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}