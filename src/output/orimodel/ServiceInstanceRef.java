package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ServiceInstanceRef extends Ref {

    
    
    protected AbstractServiceInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AbstractServiceInstanceSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AbstractServiceInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}