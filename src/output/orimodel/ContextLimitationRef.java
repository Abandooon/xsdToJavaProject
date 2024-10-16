package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ContextLimitationRef extends Ref {

    
    
    protected BswDistinguishedPartitionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswDistinguishedPartitionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswDistinguishedPartitionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}