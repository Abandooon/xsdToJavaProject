package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AssignedLinSlaveConfigRef extends Ref {

    
    
    protected LinSlaveConfigIdentSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinSlaveConfigIdentSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(LinSlaveConfigIdentSubtypesEnum value) {
        this.dest = value;
    }
    
    
}