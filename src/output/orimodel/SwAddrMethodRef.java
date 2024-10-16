package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SwAddrmethodRef extends Ref {

    
    
    protected SwAddrMethodSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwAddrMethodSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwAddrMethodSubtypesEnum value) {
        this.dest = value;
    }
    
    
}