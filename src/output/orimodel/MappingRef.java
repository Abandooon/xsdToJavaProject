package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class MappingRef extends Ref {

    
    
    protected PortInterfaceMappingSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PortInterfaceMappingSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PortInterfaceMappingSubtypesEnum value) {
        this.dest = value;
    }
    
    
}