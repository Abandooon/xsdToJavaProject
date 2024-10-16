package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DefinitionRef extends Ref {

    
    
    protected EcucContainerDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucContainerDefSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucContainerDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}