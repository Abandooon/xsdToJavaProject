package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PreconfiguredConfigurationRef extends Ref {

    
    
    protected EcucModuleConfigurationValuesSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucModuleConfigurationValuesSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucModuleConfigurationValuesSubtypesEnum value) {
        this.dest = value;
    }
    
    
}