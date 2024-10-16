package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CallbackHeaderRef extends Ref {

    
    
    protected ServiceNeedsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ServiceNeedsSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ServiceNeedsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}