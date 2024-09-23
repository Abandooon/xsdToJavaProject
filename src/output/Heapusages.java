package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Heapusages {

    
    
    protected ArrayList<MeasuredHeapUsage> measuredHeapUsages;
    
    
    
    protected ArrayList<RoughEstimateHeapUsage> roughEstimateHeapUsages;
    
    
    
    protected ArrayList<WorstCaseHeapUsage> worstCaseHeapUsages;
    
    

    
    
    @XmlElement(name="MEASURED-HEAP-USAGE")
    public ArrayList<MeasuredHeapUsage> getMeasuredHeapUsages() {
        return this.measuredHeapUsages;
    }

    public void setMeasuredHeapUsages(ArrayList<MeasuredHeapUsage> value) {
        this.measuredHeapUsages = value;
    }
    
    
    
    @XmlElement(name="ROUGH-ESTIMATE-HEAP-USAGE")
    public ArrayList<RoughEstimateHeapUsage> getRoughEstimateHeapUsages() {
        return this.roughEstimateHeapUsages;
    }

    public void setRoughEstimateHeapUsages(ArrayList<RoughEstimateHeapUsage> value) {
        this.roughEstimateHeapUsages = value;
    }
    
    
    
    @XmlElement(name="WORST-CASE-HEAP-USAGE")
    public ArrayList<WorstCaseHeapUsage> getWorstCaseHeapUsages() {
        return this.worstCaseHeapUsages;
    }

    public void setWorstCaseHeapUsages(ArrayList<WorstCaseHeapUsage> value) {
        this.worstCaseHeapUsages = value;
    }
    
    
}