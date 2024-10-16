package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ParameterValues {

    
    
    protected ArrayList<EcucAddInfoParamValue> ecucAddInfoParamValue;
    
    
    
    protected ArrayList<EcucNumericalParamValue> ecucNumericalParamValue;
    
    
    
    protected ArrayList<EcucTextualParamValue> ecucTextualParamValue;
    
    

    
    
    @XmlElement(name="ECUC-ADD-INFO-PARAM-VALUE")
    public ArrayList<EcucAddInfoParamValue> getEcucAddInfoParamValue() {
    return this.ecucAddInfoParamValue;
}

    public void setEcucAddInfoParamValue(ArrayList<EcucAddInfoParamValue> value) {
        this.ecucAddInfoParamValue = value;
    }
    
    
    
    @XmlElement(name="ECUC-NUMERICAL-PARAM-VALUE")
    public ArrayList<EcucNumericalParamValue> getEcucNumericalParamValue() {
    return this.ecucNumericalParamValue;
}

    public void setEcucNumericalParamValue(ArrayList<EcucNumericalParamValue> value) {
        this.ecucNumericalParamValue = value;
    }
    
    
    
    @XmlElement(name="ECUC-TEXTUAL-PARAM-VALUE")
    public ArrayList<EcucTextualParamValue> getEcucTextualParamValue() {
    return this.ecucTextualParamValue;
}

    public void setEcucTextualParamValue(ArrayList<EcucTextualParamValue> value) {
        this.ecucTextualParamValue = value;
    }
    
    
}