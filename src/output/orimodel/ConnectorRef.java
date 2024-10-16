package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ConnectorRef extends Ref {

    
    
    protected FlexrayCommunicationConnectorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayCommunicationConnectorSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FlexrayCommunicationConnectorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}