package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class IncludeRef extends Ref {

    
    
    protected FmFeatureSelectionSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FmFeatureSelectionSetSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FmFeatureSelectionSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}