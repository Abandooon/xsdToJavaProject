package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FramePortRef extends Ref {

    
    
    protected FramePortSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FramePortSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FramePortSubtypesEnum value) {
        this.dest = value;
    }
    
    
}