package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class AutosarEngineeringObject {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected NmtokenString shortLabel;
    
    
    
    protected NmtokenString category;
    
    
    
    protected RevisionLabels revisionLabels;
    
    
    
    protected NmtokenString domain;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public NmtokenString getShortLabel() {
        return this.shortLabel;
    }

    public void setShortLabel(NmtokenString value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public NmtokenString getCategory() {
        return this.category;
    }

    public void setCategory(NmtokenString value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="REVISION-LABELS")
    public RevisionLabels getRevisionLabels() {
        return this.revisionLabels;
    }

    public void setRevisionLabels(RevisionLabels value) {
        this.revisionLabels = value;
    }
    
    
    
    @XmlElement(name="DOMAIN")
    public NmtokenString getDomain() {
        return this.domain;
    }

    public void setDomain(NmtokenString value) {
        this.domain = value;
    }
    
    


    
    public static class RevisionLabels {
        
        protected ArrayList<RevisionLabelString> revisionLabel;
        

        
        @XmlElement(name="REVISION-LABEL")
        public ArrayList<RevisionLabelString> getRevisionLabel() {
            return this.revisionLabel;
        }

        public void setRevisionLabel(ArrayList<RevisionLabelString> value) {
            this.revisionLabel = value;
        }
        

        
    }
    
}