package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class MulticastRef_CanTpConnection extends Ref {

    
    
    protected CanTpAddressSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CanTpAddressSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CanTpAddressSubtypesEnum value) {
        this.dest = value;
    }
    
    
}