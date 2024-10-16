package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ComplexTypeMapping {

    
    
    protected ClientServerArrayTypeMapping clientServerArrayTypeMapping;
    
    
    
    protected ClientServerRecordTypeMapping clientServerRecordTypeMapping;
    
    

    
    
    @XmlElement(name="CLIENT-SERVER-ARRAY-TYPE-MAPPING")
    public ClientServerArrayTypeMapping getClientServerArrayTypeMapping() {
    return this.clientServerArrayTypeMapping;
}

    public void setClientServerArrayTypeMapping(ClientServerArrayTypeMapping value) {
        this.clientServerArrayTypeMapping = value;
    }
    
    
    
    @XmlElement(name="CLIENT-SERVER-RECORD-TYPE-MAPPING")
    public ClientServerRecordTypeMapping getClientServerRecordTypeMapping() {
    return this.clientServerRecordTypeMapping;
}

    public void setClientServerRecordTypeMapping(ClientServerRecordTypeMapping value) {
        this.clientServerRecordTypeMapping = value;
    }
    
    
}