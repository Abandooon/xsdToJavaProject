package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BswModuleDescriptionRef extends Ref {

    
    
    protected BswModuleDescriptionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswModuleDescriptionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswModuleDescriptionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}