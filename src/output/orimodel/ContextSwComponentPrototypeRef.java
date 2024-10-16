package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ContextSwComponentPrototypeRef extends Ref {

    
    
    protected SwComponentPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwComponentPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwComponentPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}