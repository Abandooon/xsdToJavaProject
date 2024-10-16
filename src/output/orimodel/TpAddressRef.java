package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TpAddressRef extends Ref {

    
    
    protected TpAddressSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TpAddressSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TpAddressSubtypesEnum value) {
        this.dest = value;
    }
    
    
}