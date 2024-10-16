package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EvaluatedElementRef extends Ref {

    
    
    protected CollectableElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CollectableElementSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CollectableElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}