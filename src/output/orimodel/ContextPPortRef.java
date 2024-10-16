package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ContextPPortRef extends Ref {

    
    
    protected AbstractProvidedPortPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AbstractProvidedPortPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AbstractProvidedPortPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}