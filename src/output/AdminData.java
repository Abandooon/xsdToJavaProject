package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class AdminData {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected LEnum language;
    
    
    
    protected MultiLanguagePlainText usedLanguages;
    
    
    
    protected DocRevisions docRevisions;
    
    
    
    protected Sdgs sdgs;
    
    

    
    
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
    
    
    
    @XmlElement(name="LANGUAGE")
    public LEnum getLanguage() {
        return this.language;
    }

    public void setLanguage(LEnum value) {
        this.language = value;
    }
    
    
    
    @XmlElement(name="USED-LANGUAGES")
    public MultiLanguagePlainText getUsedLanguages() {
        return this.usedLanguages;
    }

    public void setUsedLanguages(MultiLanguagePlainText value) {
        this.usedLanguages = value;
    }
    
    
    
    @XmlElement(name="DOC-REVISIONS")
    public DocRevisions getDocRevisions() {
        return this.docRevisions;
    }

    public void setDocRevisions(DocRevisions value) {
        this.docRevisions = value;
    }
    
    
    
    @XmlElement(name="SDGS")
    public Sdgs getSdgs() {
        return this.sdgs;
    }

    public void setSdgs(Sdgs value) {
        this.sdgs = value;
    }
    
    
}