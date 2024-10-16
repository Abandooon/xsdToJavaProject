package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EcuInstanceRef extends Ref {

    
    
    protected EcuInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcuInstanceSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcuInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}