package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReceivedDataRef extends Ref {

    
    
    protected VariableDataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public VariableDataPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(VariableDataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}