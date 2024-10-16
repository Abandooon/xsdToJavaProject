package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PortPrototypeBlueprintRef extends Ref {

    
    
    protected PortPrototypeBlueprintSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PortPrototypeBlueprintSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PortPrototypeBlueprintSubtypesEnum value) {
        this.dest = value;
    }
    
    
}