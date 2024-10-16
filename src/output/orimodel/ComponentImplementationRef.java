package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ComponentImplementationRef extends Ref {

    
    
    protected SwcImplementationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwcImplementationSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwcImplementationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}