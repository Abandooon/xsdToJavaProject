package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SwRecordLayoutRef extends Ref {

    
    
    protected SwRecordLayoutSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwRecordLayoutSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwRecordLayoutSubtypesEnum value) {
        this.dest = value;
    }
    
    
}