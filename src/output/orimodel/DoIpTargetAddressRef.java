package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DoIpTargetAddressRef extends Ref {

    
    
    protected DoIpLogicAddressSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DoIpLogicAddressSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DoIpLogicAddressSubtypesEnum value) {
        this.dest = value;
    }
    
    
}