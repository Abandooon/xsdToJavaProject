package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class UnitRef extends Ref {

    
    
    protected UnitSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public UnitSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(UnitSubtypesEnum value) {
        this.dest = value;
    }
    
    
}