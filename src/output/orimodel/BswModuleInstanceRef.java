package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BswModuleInstanceRef extends Ref {

    
    
    protected BswImplementationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswImplementationSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswImplementationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}