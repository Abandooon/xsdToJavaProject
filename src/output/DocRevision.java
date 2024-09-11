package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DocRevision {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected RevisionLabelString revisionLabel;
    
    
    
    protected RevisionLabelString revisionLabelP1;
    
    
    
    protected RevisionLabelString revisionLabelP2;
    
    
    
    protected NmtokenString state;
    
    
    
    protected String issuedBy;
    
    
    
    protected Date date;
    
    
    
    protected Modifications modifications;
    
    

    
    
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
    
    
    
    @XmlElement(name="REVISION-LABEL")
    public RevisionLabelString getRevisionLabel() {
        return this.revisionLabel;
    }

    public void setRevisionLabel(RevisionLabelString value) {
        this.revisionLabel = value;
    }
    
    
    
    @XmlElement(name="REVISION-LABEL-P-1")
    public RevisionLabelString getRevisionLabelP1() {
        return this.revisionLabelP1;
    }

    public void setRevisionLabelP1(RevisionLabelString value) {
        this.revisionLabelP1 = value;
    }
    
    
    
    @XmlElement(name="REVISION-LABEL-P-2")
    public RevisionLabelString getRevisionLabelP2() {
        return this.revisionLabelP2;
    }

    public void setRevisionLabelP2(RevisionLabelString value) {
        this.revisionLabelP2 = value;
    }
    
    
    
    @XmlElement(name="STATE")
    public NmtokenString getState() {
        return this.state;
    }

    public void setState(NmtokenString value) {
        this.state = value;
    }
    
    
    
    @XmlElement(name="ISSUED-BY")
    public String getIssuedBy() {
        return this.issuedBy;
    }

    public void setIssuedBy(String value) {
        this.issuedBy = value;
    }
    
    
    
    @XmlElement(name="DATE")
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date value) {
        this.date = value;
    }
    
    
    
    @XmlElement(name="MODIFICATIONS")
    public Modifications getModifications() {
        return this.modifications;
    }

    public void setModifications(Modifications value) {
        this.modifications = value;
    }
    
    


    
    public static class Modifications {
        

        

        
    }
    
}