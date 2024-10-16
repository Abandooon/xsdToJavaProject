package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DirectTpSduRef extends Ref {

    
    
    protected IPduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public IPduSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(IPduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}