package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ResponseOnEventRef extends Ref {

    
    
    protected TpConnectionIdentSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TpConnectionIdentSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TpConnectionIdentSubtypesEnum value) {
        this.dest = value;
    }
    
    
}