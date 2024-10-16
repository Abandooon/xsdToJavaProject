package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DataTypeMappingRef extends Ref {

    
    
    protected DataTypeMappingSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DataTypeMappingSetSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DataTypeMappingSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}