package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TtCanClusterRef extends Ref {

    
    
    protected TtcanClusterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TtcanClusterSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TtcanClusterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}