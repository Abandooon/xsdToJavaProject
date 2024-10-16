package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RepresentedPortGroupRef extends Ref {

    
    
    protected PortGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PortGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PortGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}