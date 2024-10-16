package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReferencedTdEventSwcRef extends Ref {

    
    
    protected TdEventSwcSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TdEventSwcSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TdEventSwcSubtypesEnum value) {
        this.dest = value;
    }
    
    
}