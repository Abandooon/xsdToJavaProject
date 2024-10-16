package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EventSourceRef_AsynchronousServerCallReturnsEvent extends Ref {

    
    
    protected AsynchronousServerCallResultPointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AsynchronousServerCallResultPointSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AsynchronousServerCallResultPointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}