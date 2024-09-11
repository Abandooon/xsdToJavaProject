package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class McSupportData {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected EmulationSupports emulationSupports;
    
    
    
    protected McParameterInstances mcParameterInstances;
    
    
    
    protected McVariableInstances mcVariableInstances;
    
    
    
    protected MeasurableSystemConstantValuesRefs measurableSystemConstantValuesRefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="EMULATION-SUPPORTS")
    public EmulationSupports getEmulationSupports() {
        return this.emulationSupports;
    }

    public void setEmulationSupports(EmulationSupports value) {
        this.emulationSupports = value;
    }
    
    
    
    @XmlElement(name="MC-PARAMETER-INSTANCES")
    public McParameterInstances getMcParameterInstances() {
        return this.mcParameterInstances;
    }

    public void setMcParameterInstances(McParameterInstances value) {
        this.mcParameterInstances = value;
    }
    
    
    
    @XmlElement(name="MC-VARIABLE-INSTANCES")
    public McVariableInstances getMcVariableInstances() {
        return this.mcVariableInstances;
    }

    public void setMcVariableInstances(McVariableInstances value) {
        this.mcVariableInstances = value;
    }
    
    
    
    @XmlElement(name="MEASURABLE-SYSTEM-CONSTANT-VALUES-REFS")
    public MeasurableSystemConstantValuesRefs getMeasurableSystemConstantValuesRefs() {
        return this.measurableSystemConstantValuesRefs;
    }

    public void setMeasurableSystemConstantValuesRefs(MeasurableSystemConstantValuesRefs value) {
        this.measurableSystemConstantValuesRefs = value;
    }
    
    


    
    public static class EmulationSupports {
        

        

        
    }
    
    public static class McParameterInstances {
        

        

        
    }
    
    public static class McVariableInstances {
        

        

        
    }
    
    public static class MeasurableSystemConstantValuesRefs {
        

        

        
    }
    
}