package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ClientIdDefinitionSetRef extends Ref {

    
    
    protected ClientIdDefinitionSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ClientIdDefinitionSetSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ClientIdDefinitionSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}