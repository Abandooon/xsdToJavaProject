package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReceiverRef_FlexrayTpConnection extends Ref {

    
    
    protected FlexrayTpNodeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayTpNodeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FlexrayTpNodeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}