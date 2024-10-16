package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TargetRunnableEntityGroupRef extends Ref {

    
    
    protected RunnableEntityGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public RunnableEntityGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(RunnableEntityGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}