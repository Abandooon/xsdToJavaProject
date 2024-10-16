package stdgui.data.model.orimodel;
@XmlRootElement(name = "INTERPOLATION-ROUTINE-MAPPING")
public class InterpolationRoutineMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<InterpolationRoutine> interpolationRoutines;
    
    
    
    protected SwRecordLayoutRef swRecordLayoutRef;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="INTERPOLATION-ROUTINES")
@XmlElement(name="INTERPOLATION-ROUTINE")
    public ArrayList<InterpolationRoutine> getInterpolationRoutines() {
    return this.interpolationRoutines;
}

    public void setInterpolationRoutines(ArrayList<InterpolationRoutine> value) {
        this.interpolationRoutines = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-REF")
    public SwRecordLayoutRef getSwRecordLayoutRef() {
    return this.swRecordLayoutRef;
}

    public void setSwRecordLayoutRef(SwRecordLayoutRef value) {
        this.swRecordLayoutRef = value;
    }
    
    
}