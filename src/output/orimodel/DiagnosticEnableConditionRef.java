package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DiagnosticEnableConditionRef extends Ref {

    
    
    protected DiagnosticEnableConditionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticEnableConditionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticEnableConditionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}