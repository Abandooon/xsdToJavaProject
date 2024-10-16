package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReceiverRef_J1939TpConnection extends Ref {

    
    
    protected J1939TpNodeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public J1939TpNodeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(J1939TpNodeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}