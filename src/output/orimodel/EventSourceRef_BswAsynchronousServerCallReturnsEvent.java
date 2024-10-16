package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EventSourceRef_BswAsynchronousServerCallReturnsEvent extends Ref {

    
    
    protected BswAsynchronousServerCallResultPointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswAsynchronousServerCallResultPointSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswAsynchronousServerCallResultPointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}