package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ConsumedEventGroupRef extends Ref {

    
    
    protected ConsumedEventGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ConsumedEventGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ConsumedEventGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}