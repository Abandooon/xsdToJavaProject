package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-PERIODIC-RATE")
public class DiagnosticPeriodicRate {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TimeValue period;
    
    

    
    
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
    
    
    
    @XmlElement(name="PERIOD")
    public TimeValue getPeriod() {
    return this.period;
}

    public void setPeriod(TimeValue value) {
        this.period = value;
    }
    
    
}