package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ImplConstantRef extends Ref {

    
    
    protected ConstantSpecificationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ConstantSpecificationSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ConstantSpecificationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}