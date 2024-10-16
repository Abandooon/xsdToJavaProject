package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SourceRef extends Ref {

    
    
    protected FlexrayArTpNodeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayArTpNodeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FlexrayArTpNodeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}