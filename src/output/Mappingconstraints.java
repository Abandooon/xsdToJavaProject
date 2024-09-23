package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Mappingconstraints {

    
    
    protected ArrayList<ComponentClustering> componentClusterings;
    
    
    
    protected ArrayList<ComponentSeparation> componentSeparations;
    
    
    
    protected ArrayList<SwcToEcuMappingConstraint> swcToEcuMappingConstraints;
    
    

    
    
    @XmlElement(name="COMPONENT-CLUSTERING")
    public ArrayList<ComponentClustering> getComponentClusterings() {
        return this.componentClusterings;
    }

    public void setComponentClusterings(ArrayList<ComponentClustering> value) {
        this.componentClusterings = value;
    }
    
    
    
    @XmlElement(name="COMPONENT-SEPARATION")
    public ArrayList<ComponentSeparation> getComponentSeparations() {
        return this.componentSeparations;
    }

    public void setComponentSeparations(ArrayList<ComponentSeparation> value) {
        this.componentSeparations = value;
    }
    
    
    
    @XmlElement(name="SWC-TO-ECU-MAPPING-CONSTRAINT")
    public ArrayList<SwcToEcuMappingConstraint> getSwcToEcuMappingConstraints() {
        return this.swcToEcuMappingConstraints;
    }

    public void setSwcToEcuMappingConstraints(ArrayList<SwcToEcuMappingConstraint> value) {
        this.swcToEcuMappingConstraints = value;
    }
    
    
}