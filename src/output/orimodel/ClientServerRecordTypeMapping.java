package stdgui.data.model.orimodel;
@XmlRootElement(name = "CLIENT-SERVER-RECORD-TYPE-MAPPING")
public class ClientServerRecordTypeMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArgumentRef argumentRef;
    
    
    
    protected ArrayList<ClientServerRecordElementMapping> recordElementMappings;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
    return this.s;
}

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
    return this.t;
}

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="ARGUMENT-REF")
    public ArgumentRef getArgumentRef() {
    return this.argumentRef;
}

    public void setArgumentRef(ArgumentRef value) {
        this.argumentRef = value;
    }
    
    
    
    @XmlElementWrapper(name="RECORD-ELEMENT-MAPPINGS")
@XmlElement(name="CLIENT-SERVER-RECORD-ELEMENT-MAPPING")
    public ArrayList<ClientServerRecordElementMapping> getRecordElementMappings() {
    return this.recordElementMappings;
}

    public void setRecordElementMappings(ArrayList<ClientServerRecordElementMapping> value) {
        this.recordElementMappings = value;
    }
    
    
}