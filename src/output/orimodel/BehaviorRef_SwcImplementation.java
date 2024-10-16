package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BehaviorRef_SwcImplementation extends Ref {

    
    
    protected SwcInternalBehaviorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwcInternalBehaviorSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwcInternalBehaviorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}