package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CollectionRef extends Ref {

    
    
    protected CollectionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CollectionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CollectionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}