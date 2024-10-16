package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FlatInstanceRef extends Ref {

    
    
    protected FlatInstanceDescriptorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlatInstanceDescriptorSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FlatInstanceDescriptorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}