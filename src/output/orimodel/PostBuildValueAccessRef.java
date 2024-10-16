package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PostBuildValueAccessRef extends Ref {

    
    
    protected PostBuildVariantCriterionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PostBuildVariantCriterionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PostBuildVariantCriterionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}