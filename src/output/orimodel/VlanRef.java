package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class VlanRef extends Ref {

    
    
    protected EthernetPhysicalChannelSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EthernetPhysicalChannelSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EthernetPhysicalChannelSubtypesEnum value) {
        this.dest = value;
    }
    
    
}