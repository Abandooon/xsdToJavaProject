package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SwCompToEcuMappingRef extends Ref {

    
    
    protected SwcToEcuMappingSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwcToEcuMappingSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwcToEcuMappingSubtypesEnum value) {
        this.dest = value;
    }
    
    
}