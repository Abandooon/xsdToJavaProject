package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FirstModeGroupRef extends Ref {

    
    
    protected ModeDeclarationGroupPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ModeDeclarationGroupPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ModeDeclarationGroupPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}