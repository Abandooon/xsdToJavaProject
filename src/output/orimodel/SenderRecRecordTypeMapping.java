package stdgui.data.model.orimodel;
@XmlRootElement(name = "SENDER-REC-RECORD-TYPE-MAPPING")
public class SenderRecRecordTypeMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<SenderRecRecordElementMapping> recordElementMappings;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="RECORD-ELEMENT-MAPPINGS")
@XmlElement(name="SENDER-REC-RECORD-ELEMENT-MAPPING")
    public ArrayList<SenderRecRecordElementMapping> getRecordElementMappings() {
    return this.recordElementMappings;
}

    public void setRecordElementMappings(ArrayList<SenderRecRecordElementMapping> value) {
        this.recordElementMappings = value;
    }
    
    
}