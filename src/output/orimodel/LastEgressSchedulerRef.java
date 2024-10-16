package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class LastEgressSchedulerRef extends Ref {

    
    
    protected CouplingPortSchedulerSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CouplingPortSchedulerSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CouplingPortSchedulerSubtypesEnum value) {
        this.dest = value;
    }
    
    
}