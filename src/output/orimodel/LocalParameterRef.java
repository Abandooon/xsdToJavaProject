package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class LocalParameterRef extends Ref {

    
    
    protected DataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DataPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}