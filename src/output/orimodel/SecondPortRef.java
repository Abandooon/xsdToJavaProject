package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SecondPortRef extends Ref {

    
    
    protected CouplingPortSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CouplingPortSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CouplingPortSubtypesEnum value) {
        this.dest = value;
    }
    
    
}