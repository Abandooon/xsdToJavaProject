package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ProvidedInterfaceTref extends Ref {

    
    
    protected PortInterfaceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PortInterfaceSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PortInterfaceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}