package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SenderReceiverAnnotations {

    
    
    protected ArrayList<ReceiverAnnotation> receiverAnnotation;
    
    
    
    protected ArrayList<SenderAnnotation> senderAnnotation;
    
    

    
    
    @XmlElement(name="RECEIVER-ANNOTATION")
    public ArrayList<ReceiverAnnotation> getReceiverAnnotation() {
    return this.receiverAnnotation;
}

    public void setReceiverAnnotation(ArrayList<ReceiverAnnotation> value) {
        this.receiverAnnotation = value;
    }
    
    
    
    @XmlElement(name="SENDER-ANNOTATION")
    public ArrayList<SenderAnnotation> getSenderAnnotation() {
    return this.senderAnnotation;
}

    public void setSenderAnnotation(ArrayList<SenderAnnotation> value) {
        this.senderAnnotation = value;
    }
    
    
}