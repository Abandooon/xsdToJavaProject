package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FollowUpActionRef extends Ref {

    
    
    protected BuildActionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BuildActionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BuildActionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}