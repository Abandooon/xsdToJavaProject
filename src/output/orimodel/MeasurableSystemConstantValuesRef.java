package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class MeasurableSystemConstantValuesRef extends Ref {

    
    
    protected SwSystemconstantValueSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwSystemconstantValueSetSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwSystemconstantValueSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}