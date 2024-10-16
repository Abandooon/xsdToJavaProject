package stdgui.data.model.orimodel;
@XmlRootElement(name = "CYCLE-COUNTER")
public class CycleCounter {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer cycleCounter;
    
    

    
    
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
    
    
    
    @XmlElement(name="CYCLE-COUNTER")
    public Integer getCycleCounter() {
    return this.cycleCounter;
}

    public void setCycleCounter(Integer value) {
        this.cycleCounter = value;
    }
    
    
}