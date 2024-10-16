package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PostBuildVariantCriterionValueSetRef extends Ref {

    
    
    protected PostBuildVariantCriterionValueSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PostBuildVariantCriterionValueSetSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PostBuildVariantCriterionValueSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}