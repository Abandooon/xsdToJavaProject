package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReferenceValueRef extends Ref {

    
    
    protected DataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DataPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}