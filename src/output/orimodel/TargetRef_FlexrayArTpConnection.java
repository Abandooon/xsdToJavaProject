package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TargetRef_FlexrayArTpConnection extends Ref {

    
    
    protected FlexrayArTpNodeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayArTpNodeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FlexrayArTpNodeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}