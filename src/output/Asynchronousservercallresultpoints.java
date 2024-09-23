package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Asynchronousservercallresultpoints {

    
    
    protected ArrayList<AsynchronousServerCallResultPoint> asynchronousServerCallResultPoints;
    
    

    
    
    @XmlElement(name="ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
    public ArrayList<AsynchronousServerCallResultPoint> getAsynchronousServerCallResultPoints() {
        return this.asynchronousServerCallResultPoints;
    }

    public void setAsynchronousServerCallResultPoints(ArrayList<AsynchronousServerCallResultPoint> value) {
        this.asynchronousServerCallResultPoints = value;
    }
    
    
}