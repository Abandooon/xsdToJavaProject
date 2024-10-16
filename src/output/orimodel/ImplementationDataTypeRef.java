package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ImplementationDataTypeRef extends Ref {

    
    
    protected ImplementationDataTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ImplementationDataTypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ImplementationDataTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}