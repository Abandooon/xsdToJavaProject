package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class HwPinGroupRef extends Ref {

    
    
    protected HwPinGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public HwPinGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(HwPinGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}