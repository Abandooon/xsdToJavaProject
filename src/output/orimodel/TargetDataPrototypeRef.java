package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TargetDataPrototypeRef extends Ref {

    
    
    protected ApplicationCompositeElementDataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationCompositeElementDataPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ApplicationCompositeElementDataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}