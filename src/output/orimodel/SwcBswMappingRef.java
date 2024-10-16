package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SwcBswMappingRef extends Ref {

    
    
    protected SwcBswMappingSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwcBswMappingSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwcBswMappingSubtypesEnum value) {
        this.dest = value;
    }
    
    
}