package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AsynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint extends Ref {

    
    
    protected BswAsynchronousServerCallPointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswAsynchronousServerCallPointSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswAsynchronousServerCallPointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}