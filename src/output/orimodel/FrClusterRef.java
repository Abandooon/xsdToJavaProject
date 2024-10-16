package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FrClusterRef extends Ref {

    
    
    protected FlexrayClusterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayClusterSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FlexrayClusterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}