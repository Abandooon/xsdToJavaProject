package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SwAxisTypeRef extends Ref {

    
    
    protected SwAxisTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwAxisTypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwAxisTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}