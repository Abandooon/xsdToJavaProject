package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Calibrationparametervalues {

    
    
    protected ArrayList<CalibrationParameterValue> calibrationParameterValues;
    
    

    
    
    @XmlElement(name="CALIBRATION-PARAMETER-VALUE")
    public ArrayList<CalibrationParameterValue> getCalibrationParameterValues() {
        return this.calibrationParameterValues;
    }

    public void setCalibrationParameterValues(ArrayList<CalibrationParameterValue> value) {
        this.calibrationParameterValues = value;
    }
    
    
}