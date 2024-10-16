package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class LinSlaveEcuRef extends Ref {

    
    
    protected LinSlaveSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinSlaveSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(LinSlaveSubtypesEnum value) {
        this.dest = value;
    }
    
    
}