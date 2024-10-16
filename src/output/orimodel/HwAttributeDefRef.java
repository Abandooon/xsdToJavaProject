package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class HwAttributeDefRef extends Ref {

    
    
    protected HwAttributeDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public HwAttributeDefSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(HwAttributeDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}