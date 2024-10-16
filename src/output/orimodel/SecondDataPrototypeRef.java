package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SecondDataPrototypeRef extends Ref {

    
    
    protected AutosarDataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AutosarDataPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AutosarDataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}