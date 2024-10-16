package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class MacMulticastAddressRef extends Ref {

    
    
    protected MacMulticastGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public MacMulticastGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(MacMulticastGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}