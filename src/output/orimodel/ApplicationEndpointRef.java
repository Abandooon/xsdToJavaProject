package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ApplicationEndpointRef extends Ref {

    
    
    protected ApplicationEndpointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationEndpointSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ApplicationEndpointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}