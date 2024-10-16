package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FeatureModelRef extends Ref {

    
    
    protected FmFeatureModelSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FmFeatureModelSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FmFeatureModelSubtypesEnum value) {
        this.dest = value;
    }
    
    
}