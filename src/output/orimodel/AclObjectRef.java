package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AclObjectRef extends Ref {

    
    
    protected AclObjectSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AclObjectSetSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AclObjectSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}