package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PortRef extends Ref {

    
    
    protected PortPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PortPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PortPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}