package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PredecessorFifoRef extends Ref {

    
    
    protected CouplingPortFifoSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CouplingPortFifoSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CouplingPortFifoSubtypesEnum value) {
        this.dest = value;
    }
    
    
}