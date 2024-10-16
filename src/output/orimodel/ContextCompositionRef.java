package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ContextCompositionRef extends Ref {

    
    
    protected RootSwCompositionPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public RootSwCompositionPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(RootSwCompositionPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}