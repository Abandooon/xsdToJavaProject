package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PredecessorRef extends Ref {

    
    
    protected CouplingPortStructuralElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CouplingPortStructuralElementSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CouplingPortStructuralElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}