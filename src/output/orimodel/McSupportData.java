package stdgui.data.model.orimodel;
@XmlRootElement(name = "MC-SUPPORT-DATA")
public class McSupportData {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<McSwEmulationMethodSupport> emulationSupports;
    
    
    
    protected ArrayList<McDataInstance> mcParameterInstances;
    
    
    
    protected ArrayList<McDataInstance> mcVariableInstances;
    
    
    
    protected ArrayList<MeasurableSystemConstantValuesRef> measurableSystemConstantValuesRefs;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="EMULATION-SUPPORTS")
@XmlElement(name="MC-SW-EMULATION-METHOD-SUPPORT")
    public ArrayList<McSwEmulationMethodSupport> getEmulationSupports() {
    return this.emulationSupports;
}

    public void setEmulationSupports(ArrayList<McSwEmulationMethodSupport> value) {
        this.emulationSupports = value;
    }
    
    
    
    @XmlElementWrapper(name="MC-PARAMETER-INSTANCES")
@XmlElement(name="MC-DATA-INSTANCE")
    public ArrayList<McDataInstance> getMcParameterInstances() {
    return this.mcParameterInstances;
}

    public void setMcParameterInstances(ArrayList<McDataInstance> value) {
        this.mcParameterInstances = value;
    }
    
    
    
    @XmlElementWrapper(name="MC-VARIABLE-INSTANCES")
@XmlElement(name="MC-DATA-INSTANCE")
    public ArrayList<McDataInstance> getMcVariableInstances() {
    return this.mcVariableInstances;
}

    public void setMcVariableInstances(ArrayList<McDataInstance> value) {
        this.mcVariableInstances = value;
    }
    
    
    
    @XmlElementWrapper(name="MEASURABLE-SYSTEM-CONSTANT-VALUES-REFS")
@XmlElement(name="MEASURABLE-SYSTEM-CONSTANT-VALUES-REF")
    public ArrayList<MeasurableSystemConstantValuesRef> getMeasurableSystemConstantValuesRefs() {
    return this.measurableSystemConstantValuesRefs;
}

    public void setMeasurableSystemConstantValuesRefs(ArrayList<MeasurableSystemConstantValuesRef> value) {
        this.measurableSystemConstantValuesRefs = value;
    }
    
    
}