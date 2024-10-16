package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ModeDeclarationGroupRef extends Ref {

    
    
    protected ModeDeclarationGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ModeDeclarationGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ModeDeclarationGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}