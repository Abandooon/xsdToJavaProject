package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CalibrationParameterValueSetRef extends Ref {

    
    
    protected CalibrationParameterValueSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CalibrationParameterValueSetSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CalibrationParameterValueSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}