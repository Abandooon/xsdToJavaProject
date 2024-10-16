package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class NetworkEndpointRef extends Ref {

    
    
    protected NetworkEndpointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public NetworkEndpointSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(NetworkEndpointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}