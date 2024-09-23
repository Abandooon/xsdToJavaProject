package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TopicOrMsrQuery {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Topic1s> topic1ss;
    
    
    
    protected ArrayList<Msrquerytopic1s> msrQueryTopic1ss;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
        return this.s;
    }

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
        return this.t;
    }

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="TOPIC-1")
    public ArrayList<Topic1s> getTopic1ss() {
        return this.topic1ss;
    }

    public void setTopic1ss(ArrayList<Topic1s> value) {
        this.topic1ss = value;
    }
    
    
    
    @XmlElement(name="MSR-QUERY-TOPIC-1")
    public ArrayList<Msrquerytopic1s> getMsrQueryTopic1ss() {
        return this.msrQueryTopic1ss;
    }

    public void setMsrQueryTopic1ss(ArrayList<Msrquerytopic1s> value) {
        this.msrQueryTopic1ss = value;
    }
    
    
}