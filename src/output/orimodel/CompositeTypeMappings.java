package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CompositeTypeMappings {

    
    
    protected ArrayList<ClientServerArrayTypeMapping> clientServerArrayTypeMapping;
    
    
    
    protected ArrayList<ClientServerRecordTypeMapping> clientServerRecordTypeMapping;
    
    

    
    
    @XmlElement(name="CLIENT-SERVER-ARRAY-TYPE-MAPPING")
    public ArrayList<ClientServerArrayTypeMapping> getClientServerArrayTypeMapping() {
    return this.clientServerArrayTypeMapping;
}

    public void setClientServerArrayTypeMapping(ArrayList<ClientServerArrayTypeMapping> value) {
        this.clientServerArrayTypeMapping = value;
    }
    
    
    
    @XmlElement(name="CLIENT-SERVER-RECORD-TYPE-MAPPING")
    public ArrayList<ClientServerRecordTypeMapping> getClientServerRecordTypeMapping() {
    return this.clientServerRecordTypeMapping;
}

    public void setClientServerRecordTypeMapping(ArrayList<ClientServerRecordTypeMapping> value) {
        this.clientServerRecordTypeMapping = value;
    }
    
    
}