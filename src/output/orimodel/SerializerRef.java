package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SerializerRef extends Ref {

    
    
    protected SerializationTechnologySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SerializationTechnologySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SerializationTechnologySubtypesEnum value) {
        this.dest = value;
    }
    
    
}