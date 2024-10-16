package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RoutingGroupRef extends Ref {

    
    
    protected SoAdRoutingGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SoAdRoutingGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SoAdRoutingGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}