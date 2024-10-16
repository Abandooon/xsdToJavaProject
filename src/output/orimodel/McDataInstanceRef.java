package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class McDataInstanceRef extends Ref {

    
    
    protected McDataInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public McDataInstanceSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(McDataInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}