package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ConfigElementDefLocalRef extends Ref {

    
    
    protected EcucDefinitionElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucDefinitionElementSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucDefinitionElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}