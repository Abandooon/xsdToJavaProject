package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RemotePortRef extends Ref {

    
    
    protected SocketAddressSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SocketAddressSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SocketAddressSubtypesEnum value) {
        this.dest = value;
    }
    
    
}