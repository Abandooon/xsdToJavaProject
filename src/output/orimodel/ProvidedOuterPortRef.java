package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ProvidedOuterPortRef extends Ref {

    
    
    protected AbstractProvidedPortPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AbstractProvidedPortPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AbstractProvidedPortPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}