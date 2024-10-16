package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DerivedObjectRef extends Ref {

    
    
    protected AtpBlueprintableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AtpBlueprintableSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(AtpBlueprintableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}