package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ApplicationRecordElementRef extends Ref {

    
    
    protected ApplicationRecordElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationRecordElementSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ApplicationRecordElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}