package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwCalprmAxis {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected AxisIndexType swAxisIndex;
    
    
    
    protected CalprmAxisCategoryEnum category;
    
    
    
    protected SwCalibrationAccessEnum swCalibrationAccess;
    
    
    
    protected DisplayFormatString displayFormat;
    
    
    
    protected BaseTypeRef baseTypeRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-AXIS-INDEX")
    public AxisIndexType getSwAxisIndex() {
        return this.swAxisIndex;
    }

    public void setSwAxisIndex(AxisIndexType value) {
        this.swAxisIndex = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public CalprmAxisCategoryEnum getCategory() {
        return this.category;
    }

    public void setCategory(CalprmAxisCategoryEnum value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="SW-CALIBRATION-ACCESS")
    public SwCalibrationAccessEnum getSwCalibrationAccess() {
        return this.swCalibrationAccess;
    }

    public void setSwCalibrationAccess(SwCalibrationAccessEnum value) {
        this.swCalibrationAccess = value;
    }
    
    
    
    @XmlElement(name="DISPLAY-FORMAT")
    public DisplayFormatString getDisplayFormat() {
        return this.displayFormat;
    }

    public void setDisplayFormat(DisplayFormatString value) {
        this.displayFormat = value;
    }
    
    
    
    @XmlElement(name="BASE-TYPE-REF")
    public BaseTypeRef getBaseTypeRef() {
        return this.baseTypeRef;
    }

    public void setBaseTypeRef(BaseTypeRef value) {
        this.baseTypeRef = value;
    }
    
    
}