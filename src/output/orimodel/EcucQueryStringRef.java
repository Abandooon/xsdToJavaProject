package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EcucQueryStringRef extends Ref {

    
    
    protected EcucQuerySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucQuerySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucQuerySubtypesEnum value) {
        this.dest = value;
    }
    
    
}