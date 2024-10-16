package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EventSourceRef_ModeSwitchedAckEvent extends Ref {

    
    
    protected ModeSwitchPointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ModeSwitchPointSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ModeSwitchPointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}