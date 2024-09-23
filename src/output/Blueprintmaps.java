package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Blueprintmaps {

    
    
    protected ArrayList<BlueprintMapping> blueprintMappings;
    
    
    
    protected ArrayList<PortInterfaceBlueprintMapping> portInterfaceBlueprintMappings;
    
    
    
    protected ArrayList<PortPrototypeBlueprintMapping> portPrototypeBlueprintMappings;
    
    

    
    
    @XmlElement(name="BLUEPRINT-MAPPING")
    public ArrayList<BlueprintMapping> getBlueprintMappings() {
        return this.blueprintMappings;
    }

    public void setBlueprintMappings(ArrayList<BlueprintMapping> value) {
        this.blueprintMappings = value;
    }
    
    
    
    @XmlElement(name="PORT-INTERFACE-BLUEPRINT-MAPPING")
    public ArrayList<PortInterfaceBlueprintMapping> getPortInterfaceBlueprintMappings() {
        return this.portInterfaceBlueprintMappings;
    }

    public void setPortInterfaceBlueprintMappings(ArrayList<PortInterfaceBlueprintMapping> value) {
        this.portInterfaceBlueprintMappings = value;
    }
    
    
    
    @XmlElement(name="PORT-PROTOTYPE-BLUEPRINT-MAPPING")
    public ArrayList<PortPrototypeBlueprintMapping> getPortPrototypeBlueprintMappings() {
        return this.portPrototypeBlueprintMappings;
    }

    public void setPortPrototypeBlueprintMappings(ArrayList<PortPrototypeBlueprintMapping> value) {
        this.portPrototypeBlueprintMappings = value;
    }
    
    
}