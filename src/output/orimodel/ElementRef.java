package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ElementRef extends Ref {

    
    
    protected IdentifiableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public IdentifiableSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(IdentifiableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}