package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class OperationRef extends Ref {

    
    
    protected ClientServerOperationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ClientServerOperationSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ClientServerOperationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}