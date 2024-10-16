package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ApplicationArrayElementRef extends Ref {

    
    
    protected ApplicationArrayElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationArrayElementSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ApplicationArrayElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}