package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RootRef extends Ref {

    
    
    protected FmFeatureSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FmFeatureSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FmFeatureSubtypesEnum value) {
        this.dest = value;
    }
    
    
}