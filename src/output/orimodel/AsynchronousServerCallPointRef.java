package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AsynchronousServerCallPointRef extends Ref {

    
    
    protected AsynchronousServerCallPointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AsynchronousServerCallPointSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AsynchronousServerCallPointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}