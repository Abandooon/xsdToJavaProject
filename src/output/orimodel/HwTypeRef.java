package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class HwTypeRef extends Ref {

    
    
    protected HwTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public HwTypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(HwTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}