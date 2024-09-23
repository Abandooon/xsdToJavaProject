package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Callpoints {

    
    
    protected ArrayList<BswAsynchronousServerCallPoint> bswAsynchronousServerCallPoints;
    
    
    
    protected ArrayList<BswAsynchronousServerCallResultPoint> bswAsynchronousServerCallResultPoints;
    
    
    
    protected ArrayList<BswDirectCallPoint> bswDirectCallPoints;
    
    
    
    protected ArrayList<BswSynchronousServerCallPoint> bswSynchronousServerCallPoints;
    
    

    
    
    @XmlElement(name="BSW-ASYNCHRONOUS-SERVER-CALL-POINT")
    public ArrayList<BswAsynchronousServerCallPoint> getBswAsynchronousServerCallPoints() {
        return this.bswAsynchronousServerCallPoints;
    }

    public void setBswAsynchronousServerCallPoints(ArrayList<BswAsynchronousServerCallPoint> value) {
        this.bswAsynchronousServerCallPoints = value;
    }
    
    
    
    @XmlElement(name="BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
    public ArrayList<BswAsynchronousServerCallResultPoint> getBswAsynchronousServerCallResultPoints() {
        return this.bswAsynchronousServerCallResultPoints;
    }

    public void setBswAsynchronousServerCallResultPoints(ArrayList<BswAsynchronousServerCallResultPoint> value) {
        this.bswAsynchronousServerCallResultPoints = value;
    }
    
    
    
    @XmlElement(name="BSW-DIRECT-CALL-POINT")
    public ArrayList<BswDirectCallPoint> getBswDirectCallPoints() {
        return this.bswDirectCallPoints;
    }

    public void setBswDirectCallPoints(ArrayList<BswDirectCallPoint> value) {
        this.bswDirectCallPoints = value;
    }
    
    
    
    @XmlElement(name="BSW-SYNCHRONOUS-SERVER-CALL-POINT")
    public ArrayList<BswSynchronousServerCallPoint> getBswSynchronousServerCallPoints() {
        return this.bswSynchronousServerCallPoints;
    }

    public void setBswSynchronousServerCallPoints(ArrayList<BswSynchronousServerCallPoint> value) {
        this.bswSynchronousServerCallPoints = value;
    }
    
    
}