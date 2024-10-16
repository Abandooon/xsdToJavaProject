package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ComponentRef extends Ref {

    
    
    protected SwComponentTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwComponentTypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwComponentTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}