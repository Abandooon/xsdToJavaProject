package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class MulticastConnectorRef extends Ref {

    
    
    protected EthernetCommunicationConnectorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EthernetCommunicationConnectorSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EthernetCommunicationConnectorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}