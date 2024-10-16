package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class IncludedLibraryRef extends Ref {

    
    
    protected DependencyOnArtifactSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DependencyOnArtifactSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DependencyOnArtifactSubtypesEnum value) {
        this.dest = value;
    }
    
    
}