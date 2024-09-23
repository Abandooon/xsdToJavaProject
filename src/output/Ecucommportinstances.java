package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecucommportinstances {

    
    
    protected ArrayList<FramePort> framePorts;
    
    
    
    protected ArrayList<IPduPort> iPduPorts;
    
    
    
    protected ArrayList<ISignalPort> iSignalPorts;
    
    

    
    
    @XmlElement(name="FRAME-PORT")
    public ArrayList<FramePort> getFramePorts() {
        return this.framePorts;
    }

    public void setFramePorts(ArrayList<FramePort> value) {
        this.framePorts = value;
    }
    
    
    
    @XmlElement(name="I-PDU-PORT")
    public ArrayList<IPduPort> getIPduPorts() {
        return this.iPduPorts;
    }

    public void setIPduPorts(ArrayList<IPduPort> value) {
        this.iPduPorts = value;
    }
    
    
    
    @XmlElement(name="I-SIGNAL-PORT")
    public ArrayList<ISignalPort> getISignalPorts() {
        return this.iSignalPorts;
    }

    public void setISignalPorts(ArrayList<ISignalPort> value) {
        this.iSignalPorts = value;
    }
    
    
}