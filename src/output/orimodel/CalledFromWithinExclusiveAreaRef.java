package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CalledFromWithinExclusiveAreaRef extends Ref {

    
    
    protected ExclusiveAreaNestingOrderSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ExclusiveAreaNestingOrderSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ExclusiveAreaNestingOrderSubtypesEnum value) {
        this.dest = value;
    }
    
    
}