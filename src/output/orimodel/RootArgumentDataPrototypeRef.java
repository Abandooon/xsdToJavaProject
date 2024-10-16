package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RootArgumentDataPrototypeRef extends Ref {

    
    
    protected ArgumentDataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ArgumentDataPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ArgumentDataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}