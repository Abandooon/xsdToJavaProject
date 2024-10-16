package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CanTpChannelRef extends Ref {

    
    
    protected CanTpChannelSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CanTpChannelSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CanTpChannelSubtypesEnum value) {
        this.dest = value;
    }
    
    
}