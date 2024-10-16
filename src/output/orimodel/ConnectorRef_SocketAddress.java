package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ConnectorRef_SocketAddress extends Ref {

    
    
    protected EthernetCommunicationConnectorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EthernetCommunicationConnectorSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EthernetCommunicationConnectorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}