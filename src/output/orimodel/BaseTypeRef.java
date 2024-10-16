package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BaseTypeRef extends Ref {

    
    
    protected SwBaseTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwBaseTypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwBaseTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}