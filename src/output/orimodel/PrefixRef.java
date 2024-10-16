package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PrefixRef extends Ref {

    
    
    protected SectionNamePrefixSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SectionNamePrefixSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SectionNamePrefixSubtypesEnum value) {
        this.dest = value;
    }
    
    
}