package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SoftwareMemorySectionRef extends Ref {

    
    
    protected MemorySectionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public MemorySectionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(MemorySectionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}