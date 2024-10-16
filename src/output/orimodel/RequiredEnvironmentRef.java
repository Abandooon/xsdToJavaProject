package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RequiredEnvironmentRef extends Ref {

    
    
    protected BuildActionEnvironmentSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BuildActionEnvironmentSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BuildActionEnvironmentSubtypesEnum value) {
        this.dest = value;
    }
    
    
}