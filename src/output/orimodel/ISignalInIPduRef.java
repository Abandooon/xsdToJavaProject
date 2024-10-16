package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ISignalInIPduRef extends Ref {

    
    
    protected ISignalToIPduMappingSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalToIPduMappingSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ISignalToIPduMappingSubtypesEnum value) {
        this.dest = value;
    }
    
    
}