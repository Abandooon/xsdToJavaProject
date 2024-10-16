package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class StackUsages {

    
    
    protected ArrayList<MeasuredStackUsage> measuredStackUsage;
    
    
    
    protected ArrayList<RoughEstimateStackUsage> roughEstimateStackUsage;
    
    
    
    protected ArrayList<WorstCaseStackUsage> worstCaseStackUsage;
    
    

    
    
    @XmlElement(name="MEASURED-STACK-USAGE")
    public ArrayList<MeasuredStackUsage> getMeasuredStackUsage() {
    return this.measuredStackUsage;
}

    public void setMeasuredStackUsage(ArrayList<MeasuredStackUsage> value) {
        this.measuredStackUsage = value;
    }
    
    
    
    @XmlElement(name="ROUGH-ESTIMATE-STACK-USAGE")
    public ArrayList<RoughEstimateStackUsage> getRoughEstimateStackUsage() {
    return this.roughEstimateStackUsage;
}

    public void setRoughEstimateStackUsage(ArrayList<RoughEstimateStackUsage> value) {
        this.roughEstimateStackUsage = value;
    }
    
    
    
    @XmlElement(name="WORST-CASE-STACK-USAGE")
    public ArrayList<WorstCaseStackUsage> getWorstCaseStackUsage() {
    return this.worstCaseStackUsage;
}

    public void setWorstCaseStackUsage(ArrayList<WorstCaseStackUsage> value) {
        this.worstCaseStackUsage = value;
    }
    
    
}