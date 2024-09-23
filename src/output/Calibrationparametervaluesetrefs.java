package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Calibrationparametervaluesetrefs {

    
    
    protected ArrayList<CalibrationParameterValueSetRef> calibrationParameterValueSetRefs;
    
    

    
    
    @XmlElement(name="CALIBRATION-PARAMETER-VALUE-SET-REF")
    public ArrayList<CalibrationParameterValueSetRef> getCalibrationParameterValueSetRefs() {
        return this.calibrationParameterValueSetRefs;
    }

    public void setCalibrationParameterValueSetRefs(ArrayList<CalibrationParameterValueSetRef> value) {
        this.calibrationParameterValueSetRefs = value;
    }
    
    
}