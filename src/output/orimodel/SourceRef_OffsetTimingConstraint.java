package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SourceRef_OffsetTimingConstraint extends Ref {

    
    
    protected TimingDescriptionEventSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TimingDescriptionEventSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TimingDescriptionEventSubtypesEnum value) {
        this.dest = value;
    }
    
    
}