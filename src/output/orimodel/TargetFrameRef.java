package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TargetFrameRef extends Ref {

    
    
    protected FrameTriggeringSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FrameTriggeringSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FrameTriggeringSubtypesEnum value) {
        this.dest = value;
    }
    
    
}