package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PerInstanceMemoryRef extends Ref {

    
    
    protected PerInstanceMemorySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PerInstanceMemorySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PerInstanceMemorySubtypesEnum value) {
        this.dest = value;
    }
    
    
}