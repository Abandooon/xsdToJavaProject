package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EcucRef extends Ref {

    
    
    protected EcucDefinitionElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucDefinitionElementSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucDefinitionElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}