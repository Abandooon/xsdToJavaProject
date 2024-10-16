package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReceiverRef_LinTpConnection extends Ref {

    
    
    protected LinTpNodeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinTpNodeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(LinTpNodeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}