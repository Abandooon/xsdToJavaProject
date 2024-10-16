package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ScopeRef_LatencyTimingConstraint extends Ref {

    
    
    protected TimingDescriptionEventChainSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TimingDescriptionEventChainSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TimingDescriptionEventChainSubtypesEnum value) {
        this.dest = value;
    }
    
    
}