package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TimingEventRef extends Ref {

    
    
    protected TimingEventSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TimingEventSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TimingEventSubtypesEnum value) {
        this.dest = value;
    }
    
    
}