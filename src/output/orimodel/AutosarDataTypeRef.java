package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AutosarDataTypeRef extends Ref {

    
    
    protected AutosarDataTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AutosarDataTypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AutosarDataTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}