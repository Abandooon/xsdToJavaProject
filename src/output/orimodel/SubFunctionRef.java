package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SubFunctionRef extends Ref {

    
    
    protected McFunctionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public McFunctionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(McFunctionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}