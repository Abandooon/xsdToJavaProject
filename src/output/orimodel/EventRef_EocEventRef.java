package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EventRef_EocEventRef extends Ref {

    
    
    protected AbstractEventSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AbstractEventSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AbstractEventSubtypesEnum value) {
        this.dest = value;
    }
    
    
}