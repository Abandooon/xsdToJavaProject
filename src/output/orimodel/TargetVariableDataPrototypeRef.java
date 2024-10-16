package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TargetVariableDataPrototypeRef extends Ref {

    
    
    protected VariableDataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public VariableDataPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(VariableDataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}