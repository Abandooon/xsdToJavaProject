package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PhysicalChannelRef extends Ref {

    
    
    protected PhysicalChannelSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PhysicalChannelSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PhysicalChannelSubtypesEnum value) {
        this.dest = value;
    }
    
    
}