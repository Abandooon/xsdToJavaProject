package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Servercallpoints {

    
    
    protected ArrayList<AsynchronousServerCallPoint> asynchronousServerCallPoints;
    
    
    
    protected ArrayList<SynchronousServerCallPoint> synchronousServerCallPoints;
    
    

    
    
    @XmlElement(name="ASYNCHRONOUS-SERVER-CALL-POINT")
    public ArrayList<AsynchronousServerCallPoint> getAsynchronousServerCallPoints() {
        return this.asynchronousServerCallPoints;
    }

    public void setAsynchronousServerCallPoints(ArrayList<AsynchronousServerCallPoint> value) {
        this.asynchronousServerCallPoints = value;
    }
    
    
    
    @XmlElement(name="SYNCHRONOUS-SERVER-CALL-POINT")
    public ArrayList<SynchronousServerCallPoint> getSynchronousServerCallPoints() {
        return this.synchronousServerCallPoints;
    }

    public void setSynchronousServerCallPoints(ArrayList<SynchronousServerCallPoint> value) {
        this.synchronousServerCallPoints = value;
    }
    
    
}