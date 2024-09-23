package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwComponentDocumentation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Chapter swFeatureDef;
    
    
    
    protected Chapter swFeatureDesc;
    
    
    
    protected Chapter swTestDesc;
    
    
    
    protected Chapter swCalibrationNotes;
    
    
    
    protected Chapter swMaintenanceNotes;
    
    
    
    protected Chapter swDiagnosticsNotes;
    
    
    
    protected Chapter swCarbDoc;
    
    
    
    protected Chapter chapter;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-FEATURE-DEF")
    public Chapter getSwFeatureDef() {
        return this.swFeatureDef;
    }

    public void setSwFeatureDef(Chapter value) {
        this.swFeatureDef = value;
    }
    
    
    
    @XmlElement(name="SW-FEATURE-DESC")
    public Chapter getSwFeatureDesc() {
        return this.swFeatureDesc;
    }

    public void setSwFeatureDesc(Chapter value) {
        this.swFeatureDesc = value;
    }
    
    
    
    @XmlElement(name="SW-TEST-DESC")
    public Chapter getSwTestDesc() {
        return this.swTestDesc;
    }

    public void setSwTestDesc(Chapter value) {
        this.swTestDesc = value;
    }
    
    
    
    @XmlElement(name="SW-CALIBRATION-NOTES")
    public Chapter getSwCalibrationNotes() {
        return this.swCalibrationNotes;
    }

    public void setSwCalibrationNotes(Chapter value) {
        this.swCalibrationNotes = value;
    }
    
    
    
    @XmlElement(name="SW-MAINTENANCE-NOTES")
    public Chapter getSwMaintenanceNotes() {
        return this.swMaintenanceNotes;
    }

    public void setSwMaintenanceNotes(Chapter value) {
        this.swMaintenanceNotes = value;
    }
    
    
    
    @XmlElement(name="SW-DIAGNOSTICS-NOTES")
    public Chapter getSwDiagnosticsNotes() {
        return this.swDiagnosticsNotes;
    }

    public void setSwDiagnosticsNotes(Chapter value) {
        this.swDiagnosticsNotes = value;
    }
    
    
    
    @XmlElement(name="SW-CARB-DOC")
    public Chapter getSwCarbDoc() {
        return this.swCarbDoc;
    }

    public void setSwCarbDoc(Chapter value) {
        this.swCarbDoc = value;
    }
    
    
    
    @XmlElement(name="CHAPTER")
    public Chapter getChapter() {
        return this.chapter;
    }

    public void setChapter(Chapter value) {
        this.chapter = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}