package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class OffsetTimeDomainRef extends Ref {

    
    
    protected GlobalTimeDomainSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public GlobalTimeDomainSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(GlobalTimeDomainSubtypesEnum value) {
        this.dest = value;
    }
    
    
}