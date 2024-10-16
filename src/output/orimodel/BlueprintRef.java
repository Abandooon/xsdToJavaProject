package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BlueprintRef extends Ref {

    
    
    protected AtpBlueprintSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AtpBlueprintSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AtpBlueprintSubtypesEnum value) {
        this.dest = value;
    }
    
    
}