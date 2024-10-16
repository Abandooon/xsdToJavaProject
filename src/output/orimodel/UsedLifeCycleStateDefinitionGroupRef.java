package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class UsedLifeCycleStateDefinitionGroupRef extends Ref {

    
    
    protected LifeCycleStateDefinitionGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LifeCycleStateDefinitionGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(LifeCycleStateDefinitionGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}