package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class IPduPortRef extends Ref {

    
    
    protected IPduPortSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public IPduPortSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(IPduPortSubtypesEnum value) {
        this.dest = value;
    }
    
    
}