package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ProvidedServiceInstanceRef extends Ref {

    
    
    protected ProvidedServiceInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ProvidedServiceInstanceSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ProvidedServiceInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}