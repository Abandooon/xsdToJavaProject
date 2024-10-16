package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EventHandlerRef extends Ref {

    
    
    protected EventHandlerSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EventHandlerSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EventHandlerSubtypesEnum value) {
        this.dest = value;
    }
    
    
}