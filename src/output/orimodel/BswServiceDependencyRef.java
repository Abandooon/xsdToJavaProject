package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BswServiceDependencyRef extends Ref {

    
    
    protected BswServiceDependencyIdentSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswServiceDependencyIdentSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswServiceDependencyIdentSubtypesEnum value) {
        this.dest = value;
    }
    
    
}