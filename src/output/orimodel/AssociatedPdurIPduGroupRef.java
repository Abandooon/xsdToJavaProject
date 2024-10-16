package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AssociatedPdurIPduGroupRef extends Ref {

    
    
    protected PdurIPduGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PdurIPduGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PdurIPduGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}