package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SchedulerNamePrefixRef extends Ref {

    
    
    protected BswSchedulerNamePrefixSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswSchedulerNamePrefixSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswSchedulerNamePrefixSubtypesEnum value) {
        this.dest = value;
    }
    
    
}