package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class LcStateRef extends Ref {

    
    
    protected LifeCycleStateSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LifeCycleStateSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(LifeCycleStateSubtypesEnum value) {
        this.dest = value;
    }
    
    
}