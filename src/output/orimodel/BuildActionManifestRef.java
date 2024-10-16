package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BuildActionManifestRef extends Ref {

    
    
    protected BuildActionManifestSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BuildActionManifestSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BuildActionManifestSubtypesEnum value) {
        this.dest = value;
    }
    
    
}