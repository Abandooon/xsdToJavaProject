package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TypeMapping {

    
    
    protected SenderRecArrayTypeMapping senderRecArrayTypeMapping;
    
    
    
    protected SenderRecRecordTypeMapping senderRecRecordTypeMapping;
    
    

    
    
    @XmlElement(name="SENDER-REC-ARRAY-TYPE-MAPPING")
    public SenderRecArrayTypeMapping getSenderRecArrayTypeMapping() {
    return this.senderRecArrayTypeMapping;
}

    public void setSenderRecArrayTypeMapping(SenderRecArrayTypeMapping value) {
        this.senderRecArrayTypeMapping = value;
    }
    
    
    
    @XmlElement(name="SENDER-REC-RECORD-TYPE-MAPPING")
    public SenderRecRecordTypeMapping getSenderRecRecordTypeMapping() {
    return this.senderRecRecordTypeMapping;
}

    public void setSenderRecRecordTypeMapping(SenderRecRecordTypeMapping value) {
        this.senderRecRecordTypeMapping = value;
    }
    
    
}