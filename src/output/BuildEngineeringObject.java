package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BuildEngineeringObject {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected NmtokenString shortLabel;
    
    
    
    protected NmtokenString category;
    
    
    
    protected RevisionLabels revisionLabels;
    
    
    
    protected NmtokenString domain;
    
    
    
    protected NmtokenString fileType;
    
    
    
    protected UriString intendedFilename;
    
    
    
    protected NmtokenString parentCategory;
    
    
    
    protected NmtokenString parentShortLabel;
    
    
    
    protected RegularExpression shortLabelPattern;
    
    
    
    protected RegularExpression fileTypePattern;
    
    

    
    
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
    
    
    
    @XmlElement(name="FILE-TYPE")
    public NmtokenString getFileType() {
        return this.fileType;
    }

    public void setFileType(NmtokenString value) {
        this.fileType = value;
    }
    
    
    
    @XmlElement(name="INTENDED-FILENAME")
    public UriString getIntendedFilename() {
        return this.intendedFilename;
    }

    public void setIntendedFilename(UriString value) {
        this.intendedFilename = value;
    }
    
    
    
    @XmlElement(name="PARENT-CATEGORY")
    public NmtokenString getParentCategory() {
        return this.parentCategory;
    }

    public void setParentCategory(NmtokenString value) {
        this.parentCategory = value;
    }
    
    
    
    @XmlElement(name="PARENT-SHORT-LABEL")
    public NmtokenString getParentShortLabel() {
        return this.parentShortLabel;
    }

    public void setParentShortLabel(NmtokenString value) {
        this.parentShortLabel = value;
    }
    
    
    
    @XmlElement(name="SHORT-LABEL-PATTERN")
    public RegularExpression getShortLabelPattern() {
        return this.shortLabelPattern;
    }

    public void setShortLabelPattern(RegularExpression value) {
        this.shortLabelPattern = value;
    }
    
    
    
    @XmlElement(name="FILE-TYPE-PATTERN")
    public RegularExpression getFileTypePattern() {
        return this.fileTypePattern;
    }

    public void setFileTypePattern(RegularExpression value) {
        this.fileTypePattern = value;
    }
    
    
}