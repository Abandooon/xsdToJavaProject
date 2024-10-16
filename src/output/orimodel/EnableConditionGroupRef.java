package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EnableConditionGroupRef extends Ref {

    
    
    protected DiagnosticEnableConditionGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticEnableConditionGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticEnableConditionGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}