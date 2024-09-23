package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Executiontimes {

    
    
    protected ArrayList<AnalyzedExecutionTime> analyzedExecutionTimes;
    
    
    
    protected ArrayList<MeasuredExecutionTime> measuredExecutionTimes;
    
    
    
    protected ArrayList<RoughEstimateOfExecutionTime> roughEstimateOfExecutionTimes;
    
    
    
    protected ArrayList<SimulatedExecutionTime> simulatedExecutionTimes;
    
    

    
    
    @XmlElement(name="ANALYZED-EXECUTION-TIME")
    public ArrayList<AnalyzedExecutionTime> getAnalyzedExecutionTimes() {
        return this.analyzedExecutionTimes;
    }

    public void setAnalyzedExecutionTimes(ArrayList<AnalyzedExecutionTime> value) {
        this.analyzedExecutionTimes = value;
    }
    
    
    
    @XmlElement(name="MEASURED-EXECUTION-TIME")
    public ArrayList<MeasuredExecutionTime> getMeasuredExecutionTimes() {
        return this.measuredExecutionTimes;
    }

    public void setMeasuredExecutionTimes(ArrayList<MeasuredExecutionTime> value) {
        this.measuredExecutionTimes = value;
    }
    
    
    
    @XmlElement(name="ROUGH-ESTIMATE-OF-EXECUTION-TIME")
    public ArrayList<RoughEstimateOfExecutionTime> getRoughEstimateOfExecutionTimes() {
        return this.roughEstimateOfExecutionTimes;
    }

    public void setRoughEstimateOfExecutionTimes(ArrayList<RoughEstimateOfExecutionTime> value) {
        this.roughEstimateOfExecutionTimes = value;
    }
    
    
    
    @XmlElement(name="SIMULATED-EXECUTION-TIME")
    public ArrayList<SimulatedExecutionTime> getSimulatedExecutionTimes() {
        return this.simulatedExecutionTimes;
    }

    public void setSimulatedExecutionTimes(ArrayList<SimulatedExecutionTime> value) {
        this.simulatedExecutionTimes = value;
    }
    
    
}