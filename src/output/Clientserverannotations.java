package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Clientserverannotations {

    
    
    protected ArrayList<ClientServerAnnotation> clientServerAnnotations;
    
    

    
    
    @XmlElement(name="CLIENT-SERVER-ANNOTATION")
    public ArrayList<ClientServerAnnotation> getClientServerAnnotations() {
        return this.clientServerAnnotations;
    }

    public void setClientServerAnnotations(ArrayList<ClientServerAnnotation> value) {
        this.clientServerAnnotations = value;
    }
    
    
}