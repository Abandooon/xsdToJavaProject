package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FrameRef extends Ref {

    
    
    protected FrameSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FrameSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FrameSubtypesEnum value) {
        this.dest = value;
    }
    
    
}