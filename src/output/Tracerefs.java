package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tracerefs {

    
    
    protected ArrayList<TraceRef> traceRefs;
    
    

    
    
    @XmlElement(name="TRACE-REF")
    public ArrayList<TraceRef> getTraceRefs() {
        return this.traceRefs;
    }

    public void setTraceRefs(ArrayList<TraceRef> value) {
        this.traceRefs = value;
    }
    
    
}