package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DataPrototypeRef extends Ref {

    
    
    protected AutosarDataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AutosarDataPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AutosarDataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}