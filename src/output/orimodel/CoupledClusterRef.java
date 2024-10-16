package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CoupledClusterRef extends Ref {

    
    
    protected CanNmClusterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CanNmClusterSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CanNmClusterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}