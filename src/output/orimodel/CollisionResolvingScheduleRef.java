package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CollisionResolvingScheduleRef extends Ref {

    
    
    protected LinScheduleTableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinScheduleTableSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(LinScheduleTableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}