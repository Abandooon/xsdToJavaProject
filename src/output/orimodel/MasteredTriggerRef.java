package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class MasteredTriggerRef extends Ref {

    
    
    protected TriggerSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TriggerSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TriggerSubtypesEnum value) {
        this.dest = value;
    }
    
    
}