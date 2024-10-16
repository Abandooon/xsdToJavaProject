package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ProvidedRequiredInterfaceTref extends Ref {

    
    
    protected PortInterfaceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PortInterfaceSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PortInterfaceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}