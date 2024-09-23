package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Senderreceiverannotations {

    
    
    protected ArrayList<ReceiverAnnotation> receiverAnnotations;
    
    
    
    protected ArrayList<SenderAnnotation> senderAnnotations;
    
    

    
    
    @XmlElement(name="RECEIVER-ANNOTATION")
    public ArrayList<ReceiverAnnotation> getReceiverAnnotations() {
        return this.receiverAnnotations;
    }

    public void setReceiverAnnotations(ArrayList<ReceiverAnnotation> value) {
        this.receiverAnnotations = value;
    }
    
    
    
    @XmlElement(name="SENDER-ANNOTATION")
    public ArrayList<SenderAnnotation> getSenderAnnotations() {
        return this.senderAnnotations;
    }

    public void setSenderAnnotations(ArrayList<SenderAnnotation> value) {
        this.senderAnnotations = value;
    }
    
    
}