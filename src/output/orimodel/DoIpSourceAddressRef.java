package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DoIpSourceAddressRef extends Ref {

    
    
    protected DoIpLogicAddressSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DoIpLogicAddressSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DoIpLogicAddressSubtypesEnum value) {
        this.dest = value;
    }
    
    
}