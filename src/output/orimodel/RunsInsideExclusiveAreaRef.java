package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RunsInsideExclusiveAreaRef extends Ref {

    
    
    protected ExclusiveAreaSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ExclusiveAreaSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ExclusiveAreaSubtypesEnum value) {
        this.dest = value;
    }
    
    
}