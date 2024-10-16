package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class GlobalInPackageRef extends Ref {

    
    
    protected ArPackageSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ArPackageSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ArPackageSubtypesEnum value) {
        this.dest = value;
    }
    
    
}