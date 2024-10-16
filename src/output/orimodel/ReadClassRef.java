package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReadClassRef extends Ref {

    
    
    protected DiagnosticReadMemoryByAddressClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticReadMemoryByAddressClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticReadMemoryByAddressClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}