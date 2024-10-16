package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReferencedTdEventVfbRef extends Ref {

    
    
    protected TdEventVfbSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TdEventVfbSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TdEventVfbSubtypesEnum value) {
        this.dest = value;
    }
    
    
}