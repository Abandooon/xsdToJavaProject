package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReferenceValues {

    
    
    protected ArrayList<EcucInstanceReferenceValue> ecucInstanceReferenceValue;
    
    
    
    protected ArrayList<EcucReferenceValue> ecucReferenceValue;
    
    

    
    
    @XmlElement(name="ECUC-INSTANCE-REFERENCE-VALUE")
    public ArrayList<EcucInstanceReferenceValue> getEcucInstanceReferenceValue() {
    return this.ecucInstanceReferenceValue;
}

    public void setEcucInstanceReferenceValue(ArrayList<EcucInstanceReferenceValue> value) {
        this.ecucInstanceReferenceValue = value;
    }
    
    
    
    @XmlElement(name="ECUC-REFERENCE-VALUE")
    public ArrayList<EcucReferenceValue> getEcucReferenceValue() {
    return this.ecucReferenceValue;
}

    public void setEcucReferenceValue(ArrayList<EcucReferenceValue> value) {
        this.ecucReferenceValue = value;
    }
    
    
}