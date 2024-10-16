package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ContextPortRef_RModeInAtomicSwcInstanceRef extends Ref {

    
    
    protected AbstractRequiredPortPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AbstractRequiredPortPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AbstractRequiredPortPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}