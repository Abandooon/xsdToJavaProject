package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EcuConfigurationRef extends Ref {

    
    
    protected EcucValueCollectionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucValueCollectionSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucValueCollectionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}