package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SuccessorRef extends Ref {

    
    
    protected EocExecutableEntityRefAbstractSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EocExecutableEntityRefAbstractSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EocExecutableEntityRefAbstractSubtypesEnum value) {
        this.dest = value;
    }
    
    
}