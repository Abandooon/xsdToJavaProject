package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SdxRef extends Ref {

    
    
    protected ReferrableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ReferrableSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ReferrableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}