package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DtcPropsRef extends Ref {

    
    
    protected DiagnosticTroubleCodePropsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticTroubleCodePropsSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticTroubleCodePropsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}