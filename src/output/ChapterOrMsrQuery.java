package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ChapterOrMsrQuery {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Chapters> chapterss;
    
    
    
    protected ArrayList<Msrquerychapters> msrQueryChapterss;
    
    

    
    
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
    
    
    
    @XmlElement(name="CHAPTER")
    public ArrayList<Chapters> getChapterss() {
        return this.chapterss;
    }

    public void setChapterss(ArrayList<Chapters> value) {
        this.chapterss = value;
    }
    
    
    
    @XmlElement(name="MSR-QUERY-CHAPTER")
    public ArrayList<Msrquerychapters> getMsrQueryChapterss() {
        return this.msrQueryChapterss;
    }

    public void setMsrQueryChapterss(ArrayList<Msrquerychapters> value) {
        this.msrQueryChapterss = value;
    }
    
    
}