package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ISignalGroupRef extends Ref {

    
    
    protected ISignalGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ISignalGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}