package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TargetDataPrototypeGroupRef extends Ref {

    
    
    protected DataPrototypeGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DataPrototypeGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DataPrototypeGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}