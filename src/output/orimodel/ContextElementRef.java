package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ContextElementRef extends Ref {

    
    
    protected AtpFeatureSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AtpFeatureSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AtpFeatureSubtypesEnum value) {
        this.dest = value;
    }
    
    
}