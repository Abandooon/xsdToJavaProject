package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ImpliedOperationRef extends Ref {

    
    
    protected AclOperationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AclOperationSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AclOperationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}