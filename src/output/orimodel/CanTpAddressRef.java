package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CanTpAddressRef extends Ref {

    
    
    protected CanTpAddressSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CanTpAddressSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CanTpAddressSubtypesEnum value) {
        this.dest = value;
    }
    
    
}