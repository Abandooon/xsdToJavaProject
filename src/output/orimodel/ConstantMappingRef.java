package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ConstantMappingRef extends Ref {

    
    
    protected ConstantSpecificationMappingSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ConstantSpecificationMappingSetSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ConstantSpecificationMappingSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}