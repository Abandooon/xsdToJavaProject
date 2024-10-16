package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EventSourceRef_InternalTriggerOccurredEvent extends Ref {

    
    
    protected InternalTriggeringPointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public InternalTriggeringPointSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(InternalTriggeringPointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}