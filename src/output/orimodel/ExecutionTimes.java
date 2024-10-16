package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ExecutionTimes {

    
    
    protected ArrayList<AnalyzedExecutionTime> analyzedExecutionTime;
    
    
    
    protected ArrayList<MeasuredExecutionTime> measuredExecutionTime;
    
    
    
    protected ArrayList<RoughEstimateOfExecutionTime> roughEstimateOfExecutionTime;
    
    
    
    protected ArrayList<SimulatedExecutionTime> simulatedExecutionTime;
    
    

    
    
    @XmlElement(name="ANALYZED-EXECUTION-TIME")
    public ArrayList<AnalyzedExecutionTime> getAnalyzedExecutionTime() {
    return this.analyzedExecutionTime;
}

    public void setAnalyzedExecutionTime(ArrayList<AnalyzedExecutionTime> value) {
        this.analyzedExecutionTime = value;
    }
    
    
    
    @XmlElement(name="MEASURED-EXECUTION-TIME")
    public ArrayList<MeasuredExecutionTime> getMeasuredExecutionTime() {
    return this.measuredExecutionTime;
}

    public void setMeasuredExecutionTime(ArrayList<MeasuredExecutionTime> value) {
        this.measuredExecutionTime = value;
    }
    
    
    
    @XmlElement(name="ROUGH-ESTIMATE-OF-EXECUTION-TIME")
    public ArrayList<RoughEstimateOfExecutionTime> getRoughEstimateOfExecutionTime() {
    return this.roughEstimateOfExecutionTime;
}

    public void setRoughEstimateOfExecutionTime(ArrayList<RoughEstimateOfExecutionTime> value) {
        this.roughEstimateOfExecutionTime = value;
    }
    
    
    
    @XmlElement(name="SIMULATED-EXECUTION-TIME")
    public ArrayList<SimulatedExecutionTime> getSimulatedExecutionTime() {
    return this.simulatedExecutionTime;
}

    public void setSimulatedExecutionTime(ArrayList<SimulatedExecutionTime> value) {
        this.simulatedExecutionTime = value;
    }
    
    
}