package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BehaviorRef extends Ref {

    
    
    protected BswInternalBehaviorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswInternalBehaviorSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswInternalBehaviorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}