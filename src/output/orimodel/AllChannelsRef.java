package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AllChannelsRef extends Ref {

    
    
    protected CommunicationClusterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CommunicationClusterSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CommunicationClusterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}