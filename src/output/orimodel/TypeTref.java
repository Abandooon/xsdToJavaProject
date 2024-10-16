package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TypeTref extends Ref {

    
    
    protected ApplicationDataTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationDataTypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ApplicationDataTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}