package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EncapsulatedEntryRef extends Ref {

    
    
    protected BswModuleEntrySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswModuleEntrySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswModuleEntrySubtypesEnum value) {
        this.dest = value;
    }
    
    
}