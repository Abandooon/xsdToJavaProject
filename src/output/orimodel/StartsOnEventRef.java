package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class StartsOnEventRef extends Ref {

    
    
    protected BswModuleEntitySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswModuleEntitySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswModuleEntitySubtypesEnum value) {
        this.dest = value;
    }
    
    
}