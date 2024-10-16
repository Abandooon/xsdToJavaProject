package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ObjectDefinitionRef extends Ref {

    
    
    protected AtpDefinitionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AtpDefinitionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AtpDefinitionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}