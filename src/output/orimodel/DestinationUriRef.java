package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DestinationUriRef extends Ref {

    
    
    protected EcucDestinationUriDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucDestinationUriDefSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucDestinationUriDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}