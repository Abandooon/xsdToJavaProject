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
        
        protected ArrayList<McSwEmulationMethodSupport> mcSwEmulationMethodSupport;
        

        
        @XmlElement(name="MC-SW-EMULATION-METHOD-SUPPORT")
        public ArrayList<McSwEmulationMethodSupport> getMcSwEmulationMethodSupport() {
            return this.mcSwEmulationMethodSupport;
        }

        public void setMcSwEmulationMethodSupport(ArrayList<McSwEmulationMethodSupport> value) {
            this.mcSwEmulationMethodSupport = value;
        }
        

        
    }
    
    public static class McParameterInstances {
        
        protected ArrayList<McDataInstance> mcDataInstance;
        

        
        @XmlElement(name="MC-DATA-INSTANCE")
        public ArrayList<McDataInstance> getMcDataInstance() {
            return this.mcDataInstance;
        }

        public void setMcDataInstance(ArrayList<McDataInstance> value) {
            this.mcDataInstance = value;
        }
        

        
    }
    
    public static class McVariableInstances {
        
        protected ArrayList<McDataInstance> mcDataInstance;
        

        
        @XmlElement(name="MC-DATA-INSTANCE")
        public ArrayList<McDataInstance> getMcDataInstance() {
            return this.mcDataInstance;
        }

        public void setMcDataInstance(ArrayList<McDataInstance> value) {
            this.mcDataInstance = value;
        }
        

        
    }
    
    public static class MeasurableSystemConstantValuesRefs {
        
        protected ArrayList<MeasurableSystemConstantValuesRef> measurableSystemConstantValuesRef;
        

        
        @XmlElement(name="MEASURABLE-SYSTEM-CONSTANT-VALUES-REF")
        public ArrayList<MeasurableSystemConstantValuesRef> getMeasurableSystemConstantValuesRef() {
            return this.measurableSystemConstantValuesRef;
        }

        public void setMeasurableSystemConstantValuesRef(ArrayList<MeasurableSystemConstantValuesRef> value) {
            this.measurableSystemConstantValuesRef = value;
        }
        

        
        
        public static class MeasurableSystemConstantValuesRef extends Ref {
            
            protected SwSystemconstantValueSetSubtypesEnum dest;
            

            
            @XmlAttribute(name="DEST")
            public SwSystemconstantValueSetSubtypesEnum getDest() {
                return this.dest;
            }

            public void setDest(SwSystemconstantValueSetSubtypesEnum value) {
                this.dest = value;
            }
            
        }
        
        
    }
    
}