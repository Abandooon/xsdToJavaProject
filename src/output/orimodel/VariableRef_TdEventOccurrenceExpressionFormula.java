package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class VariableRef_TdEventOccurrenceExpressionFormula extends Ref {

    
    
    protected AutosarVariableInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AutosarVariableInstanceSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AutosarVariableInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}