package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PartitionRef extends Ref {

    
    
    protected EcuPartitionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcuPartitionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcuPartitionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}