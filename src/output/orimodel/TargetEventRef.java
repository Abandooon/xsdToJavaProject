package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TargetEventRef extends Ref {

    
    
    protected RteEventSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public RteEventSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(RteEventSubtypesEnum value) {
        this.dest = value;
    }
    
    
}