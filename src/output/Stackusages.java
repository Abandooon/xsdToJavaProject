package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Stackusages {

    
    
    protected ArrayList<MeasuredStackUsage> measuredStackUsages;
    
    
    
    protected ArrayList<RoughEstimateStackUsage> roughEstimateStackUsages;
    
    
    
    protected ArrayList<WorstCaseStackUsage> worstCaseStackUsages;
    
    

    
    
    @XmlElement(name="MEASURED-STACK-USAGE")
    public ArrayList<MeasuredStackUsage> getMeasuredStackUsages() {
        return this.measuredStackUsages;
    }

    public void setMeasuredStackUsages(ArrayList<MeasuredStackUsage> value) {
        this.measuredStackUsages = value;
    }
    
    
    
    @XmlElement(name="ROUGH-ESTIMATE-STACK-USAGE")
    public ArrayList<RoughEstimateStackUsage> getRoughEstimateStackUsages() {
        return this.roughEstimateStackUsages;
    }

    public void setRoughEstimateStackUsages(ArrayList<RoughEstimateStackUsage> value) {
        this.roughEstimateStackUsages = value;
    }
    
    
    
    @XmlElement(name="WORST-CASE-STACK-USAGE")
    public ArrayList<WorstCaseStackUsage> getWorstCaseStackUsages() {
        return this.worstCaseStackUsages;
    }

    public void setWorstCaseStackUsages(ArrayList<WorstCaseStackUsage> value) {
        this.worstCaseStackUsages = value;
    }
    
    
}