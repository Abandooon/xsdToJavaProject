package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ISignalRef extends Ref {

    
    
    protected ISignalSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ISignalSubtypesEnum value) {
        this.dest = value;
    }
    
    
}