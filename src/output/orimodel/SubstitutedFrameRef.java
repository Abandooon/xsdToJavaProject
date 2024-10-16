package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SubstitutedFrameRef extends Ref {

    
    
    protected LinUnconditionalFrameSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinUnconditionalFrameSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(LinUnconditionalFrameSubtypesEnum value) {
        this.dest = value;
    }
    
    
}