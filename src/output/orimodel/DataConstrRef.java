package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DataConstrRef extends Ref {

    
    
    protected DataConstrSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DataConstrSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DataConstrSubtypesEnum value) {
        this.dest = value;
    }
    
    
}