package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class MasterRef extends Ref {

    
    
    protected GlobalTimeMasterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public GlobalTimeMasterSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(GlobalTimeMasterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}