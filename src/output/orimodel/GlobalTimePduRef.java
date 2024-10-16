package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class GlobalTimePduRef extends Ref {

    
    
    protected GeneralPurposePduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public GeneralPurposePduSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(GeneralPurposePduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}