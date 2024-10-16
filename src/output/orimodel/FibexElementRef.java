package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FibexElementRef extends Ref {

    
    
    protected FibexElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FibexElementSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FibexElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}