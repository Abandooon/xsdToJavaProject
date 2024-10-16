package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class IPduRef extends Ref {

    
    
    protected ISignalIPduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalIPduSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ISignalIPduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}