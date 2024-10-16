package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class IoControlClassRef extends Ref {

    
    
    protected DiagnosticIoControlClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticIoControlClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticIoControlClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}