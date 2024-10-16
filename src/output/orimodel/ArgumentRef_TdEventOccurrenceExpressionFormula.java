package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ArgumentRef_TdEventOccurrenceExpressionFormula extends Ref {

    
    
    protected AutosarOperationArgumentInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AutosarOperationArgumentInstanceSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AutosarOperationArgumentInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}