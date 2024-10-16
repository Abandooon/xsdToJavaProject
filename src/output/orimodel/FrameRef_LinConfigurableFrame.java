package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FrameRef_LinConfigurableFrame extends Ref {

    
    
    protected LinFrameSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinFrameSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(LinFrameSubtypesEnum value) {
        this.dest = value;
    }
    
    
}