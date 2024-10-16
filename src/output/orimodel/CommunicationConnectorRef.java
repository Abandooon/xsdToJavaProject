package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CommunicationConnectorRef extends Ref {

    
    
    protected CommunicationConnectorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CommunicationConnectorSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CommunicationConnectorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}