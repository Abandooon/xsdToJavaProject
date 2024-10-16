package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SdgCaptionRef extends Ref {

    
    
    protected SdgCaptionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SdgCaptionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SdgCaptionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}