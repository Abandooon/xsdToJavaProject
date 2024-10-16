package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FlatMapRef extends Ref {

    
    
    protected FlatMapSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlatMapSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FlatMapSubtypesEnum value) {
        this.dest = value;
    }
    
    
}