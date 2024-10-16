package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EcuResetClassRef extends Ref {

    
    
    protected DiagnosticEcuResetClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticEcuResetClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticEcuResetClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}