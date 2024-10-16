package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class HwCategoryRef extends Ref {

    
    
    protected HwCategorySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public HwCategorySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(HwCategorySubtypesEnum value) {
        this.dest = value;
    }
    
    
}