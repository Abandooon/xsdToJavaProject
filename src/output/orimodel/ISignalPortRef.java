package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ISignalPortRef extends Ref {

    
    
    protected ISignalPortSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalPortSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ISignalPortSubtypesEnum value) {
        this.dest = value;
    }
    
    
}