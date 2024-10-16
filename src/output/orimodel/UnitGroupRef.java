package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class UnitGroupRef extends Ref {

    
    
    protected UnitGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public UnitGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(UnitGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}