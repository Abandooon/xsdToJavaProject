package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Xdoc {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected SingleLanguageLongName longName1;
    
    
    
    protected String number;
    
    
    
    protected String state;
    
    
    
    protected Date date;
    
    
    
    protected String publisher;
    
    
    
    protected Url url;
    
    
    
    protected String position;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
        return this.shortName;
    }

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="LONG-NAME-1")
    public SingleLanguageLongName getLongName1() {
        return this.longName1;
    }

    public void setLongName1(SingleLanguageLongName value) {
        this.longName1 = value;
    }
    
    
    
    @XmlElement(name="NUMBER")
    public String getNumber() {
        return this.number;
    }

    public void setNumber(String value) {
        this.number = value;
    }
    
    
    
    @XmlElement(name="STATE")
    public String getState() {
        return this.state;
    }

    public void setState(String value) {
        this.state = value;
    }
    
    
    
    @XmlElement(name="DATE")
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date value) {
        this.date = value;
    }
    
    
    
    @XmlElement(name="PUBLISHER")
    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String value) {
        this.publisher = value;
    }
    
    
    
    @XmlElement(name="URL")
    public Url getUrl() {
        return this.url;
    }

    public void setUrl(Url value) {
        this.url = value;
    }
    
    
    
    @XmlElement(name="POSITION")
    public String getPosition() {
        return this.position;
    }

    public void setPosition(String value) {
        this.position = value;
    }
    
    
}