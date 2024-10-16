package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class HardwareElementRef extends Ref {

    
    
    protected HwDescriptionEntitySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public HwDescriptionEntitySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(HwDescriptionEntitySubtypesEnum value) {
        this.dest = value;
    }
    
    
}