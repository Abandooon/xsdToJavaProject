package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FirstPhysicalDimensionRef extends Ref {

    
    
    protected PhysicalDimensionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PhysicalDimensionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PhysicalDimensionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}