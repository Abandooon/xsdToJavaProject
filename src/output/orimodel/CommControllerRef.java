package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CommControllerRef extends Ref {

    
    
    protected CommunicationControllerSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CommunicationControllerSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CommunicationControllerSubtypesEnum value) {
        this.dest = value;
    }
    
    
}