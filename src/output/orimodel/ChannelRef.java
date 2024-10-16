package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ChannelRef extends Ref {

    
    
    protected FlexrayPhysicalChannelSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayPhysicalChannelSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FlexrayPhysicalChannelSubtypesEnum value) {
        this.dest = value;
    }
    
    
}