package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SlaveRef extends Ref {

    
    
    protected GlobalTimeSlaveSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public GlobalTimeSlaveSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(GlobalTimeSlaveSubtypesEnum value) {
        this.dest = value;
    }
    
    
}