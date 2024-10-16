package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class IncludedVariantRef extends Ref {

    
    
    protected PredefinedVariantSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PredefinedVariantSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PredefinedVariantSubtypesEnum value) {
        this.dest = value;
    }
    
    
}