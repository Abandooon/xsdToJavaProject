package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Callbackheaderrefs {

    
    
    protected ArrayList<CallbackHeaderRef> callbackHeaderRefs;
    
    

    
    
    @XmlElement(name="CALLBACK-HEADER-REF")
    public ArrayList<CallbackHeaderRef> getCallbackHeaderRefs() {
        return this.callbackHeaderRefs;
    }

    public void setCallbackHeaderRefs(ArrayList<CallbackHeaderRef> value) {
        this.callbackHeaderRefs = value;
    }
    
    
}