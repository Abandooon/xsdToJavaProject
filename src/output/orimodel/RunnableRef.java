package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RunnableRef extends Ref {

    
    
    protected RunnableEntitySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public RunnableEntitySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(RunnableEntitySubtypesEnum value) {
        this.dest = value;
    }
    
    
}