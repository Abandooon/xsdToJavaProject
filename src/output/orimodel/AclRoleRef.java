package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AclRoleRef extends Ref {

    
    
    protected AclRoleSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AclRoleSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AclRoleSubtypesEnum value) {
        this.dest = value;
    }
    
    
}