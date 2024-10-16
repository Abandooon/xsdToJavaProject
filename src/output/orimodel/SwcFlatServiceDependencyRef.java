package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SwcFlatServiceDependencyRef extends Ref {

    
    
    protected SwcServiceDependencySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwcServiceDependencySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwcServiceDependencySubtypesEnum value) {
        this.dest = value;
    }
    
    
}