package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Graphic {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String editHeight;
    
    
    
    protected java.lang.String editWidth;
    
    
    
    protected GraphicFitEnumSimple editfit;
    
    
    
    protected java.lang.String editscale;
    
    
    
    protected java.lang.String filename;
    
    
    
    protected GraphicFitEnumSimple fit;
    
    
    
    protected java.lang.String generator;
    
    
    
    protected java.lang.String height;
    
    
    
    protected GraphicFitEnumSimple htmlFit;
    
    
    
    protected java.lang.String htmlHeight;
    
    
    
    protected java.lang.String htmlScale;
    
    
    
    protected java.lang.String htmlWidth;
    
    
    
    protected GraphicNotationEnumSimple notation;
    
    
    
    protected java.lang.String scale;
    
    
    
    protected java.lang.String width;
    
    
    
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
    
    
    
    @XmlAttribute(name="EDIT-HEIGHT")
    public java.lang.String getEditHeight() {
        return this.editHeight;
    }

    public void setEditHeight(java.lang.String value) {
        this.editHeight = value;
    }
    
    
    
    @XmlAttribute(name="EDIT-WIDTH")
    public java.lang.String getEditWidth() {
        return this.editWidth;
    }

    public void setEditWidth(java.lang.String value) {
        this.editWidth = value;
    }
    
    
    
    @XmlAttribute(name="EDITFIT")
    public GraphicFitEnumSimple getEditfit() {
        return this.editfit;
    }

    public void setEditfit(GraphicFitEnumSimple value) {
        this.editfit = value;
    }
    
    
    
    @XmlAttribute(name="EDITSCALE")
    public java.lang.String getEditscale() {
        return this.editscale;
    }

    public void setEditscale(java.lang.String value) {
        this.editscale = value;
    }
    
    
    
    @XmlAttribute(name="FILENAME")
    public java.lang.String getFilename() {
        return this.filename;
    }

    public void setFilename(java.lang.String value) {
        this.filename = value;
    }
    
    
    
    @XmlAttribute(name="FIT")
    public GraphicFitEnumSimple getFit() {
        return this.fit;
    }

    public void setFit(GraphicFitEnumSimple value) {
        this.fit = value;
    }
    
    
    
    @XmlAttribute(name="GENERATOR")
    public java.lang.String getGenerator() {
        return this.generator;
    }

    public void setGenerator(java.lang.String value) {
        this.generator = value;
    }
    
    
    
    @XmlAttribute(name="HEIGHT")
    public java.lang.String getHeight() {
        return this.height;
    }

    public void setHeight(java.lang.String value) {
        this.height = value;
    }
    
    
    
    @XmlAttribute(name="HTML-FIT")
    public GraphicFitEnumSimple getHtmlFit() {
        return this.htmlFit;
    }

    public void setHtmlFit(GraphicFitEnumSimple value) {
        this.htmlFit = value;
    }
    
    
    
    @XmlAttribute(name="HTML-HEIGHT")
    public java.lang.String getHtmlHeight() {
        return this.htmlHeight;
    }

    public void setHtmlHeight(java.lang.String value) {
        this.htmlHeight = value;
    }
    
    
    
    @XmlAttribute(name="HTML-SCALE")
    public java.lang.String getHtmlScale() {
        return this.htmlScale;
    }

    public void setHtmlScale(java.lang.String value) {
        this.htmlScale = value;
    }
    
    
    
    @XmlAttribute(name="HTML-WIDTH")
    public java.lang.String getHtmlWidth() {
        return this.htmlWidth;
    }

    public void setHtmlWidth(java.lang.String value) {
        this.htmlWidth = value;
    }
    
    
    
    @XmlAttribute(name="NOTATION")
    public GraphicNotationEnumSimple getNotation() {
        return this.notation;
    }

    public void setNotation(GraphicNotationEnumSimple value) {
        this.notation = value;
    }
    
    
    
    @XmlAttribute(name="SCALE")
    public java.lang.String getScale() {
        return this.scale;
    }

    public void setScale(java.lang.String value) {
        this.scale = value;
    }
    
    
    
    @XmlAttribute(name="WIDTH")
    public java.lang.String getWidth() {
        return this.width;
    }

    public void setWidth(java.lang.String value) {
        this.width = value;
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
    
    
}