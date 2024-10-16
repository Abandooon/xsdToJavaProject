package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CommunicationClusterRef_CouplingElement extends Ref {

    
    
    protected EthernetClusterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EthernetClusterSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EthernetClusterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}