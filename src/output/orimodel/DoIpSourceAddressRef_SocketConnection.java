package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DoIpSourceAddressRef_SocketConnection extends Ref {

    
    
    protected LogicAddressSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LogicAddressSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(LogicAddressSubtypesEnum value) {
        this.dest = value;
    }
    
    
}