package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ProvidedMemoryRef extends Ref {

    
    
    protected HwElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public HwElementSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(HwElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}