package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class HeapUsages {

    
    
    protected ArrayList<MeasuredHeapUsage> measuredHeapUsage;
    
    
    
    protected ArrayList<RoughEstimateHeapUsage> roughEstimateHeapUsage;
    
    
    
    protected ArrayList<WorstCaseHeapUsage> worstCaseHeapUsage;
    
    

    
    
    @XmlElement(name="MEASURED-HEAP-USAGE")
    public ArrayList<MeasuredHeapUsage> getMeasuredHeapUsage() {
    return this.measuredHeapUsage;
}

    public void setMeasuredHeapUsage(ArrayList<MeasuredHeapUsage> value) {
        this.measuredHeapUsage = value;
    }
    
    
    
    @XmlElement(name="ROUGH-ESTIMATE-HEAP-USAGE")
    public ArrayList<RoughEstimateHeapUsage> getRoughEstimateHeapUsage() {
    return this.roughEstimateHeapUsage;
}

    public void setRoughEstimateHeapUsage(ArrayList<RoughEstimateHeapUsage> value) {
        this.roughEstimateHeapUsage = value;
    }
    
    
    
    @XmlElement(name="WORST-CASE-HEAP-USAGE")
    public ArrayList<WorstCaseHeapUsage> getWorstCaseHeapUsage() {
    return this.worstCaseHeapUsage;
}

    public void setWorstCaseHeapUsage(ArrayList<WorstCaseHeapUsage> value) {
        this.worstCaseHeapUsage = value;
    }
    
    
}