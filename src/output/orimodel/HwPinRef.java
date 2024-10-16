package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class HwPinRef extends Ref {

    
    
    protected HwPinSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public HwPinSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(HwPinSubtypesEnum value) {
        this.dest = value;
    }
    
    
}