package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CalledEntryRef_BswSynchronousServerCallPoint extends Ref {

    
    
    protected BswModuleClientServerEntrySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswModuleClientServerEntrySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswModuleClientServerEntrySubtypesEnum value) {
        this.dest = value;
    }
    
    
}