package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Cancontrollerattributes {

    
    
    protected CanControllerConfiguration canControllerConfiguration;
    
    
    
    protected CanControllerConfigurationRequirements canControllerConfigurationRequirements;
    
    

    
    
    @XmlElement(name="CAN-CONTROLLER-CONFIGURATION")
    public CanControllerConfiguration getCanControllerConfiguration() {
        return this.canControllerConfiguration;
    }

    public void setCanControllerConfiguration(CanControllerConfiguration value) {
        this.canControllerConfiguration = value;
    }
    
    
    
    @XmlElement(name="CAN-CONTROLLER-CONFIGURATION-REQUIREMENTS")
    public CanControllerConfigurationRequirements getCanControllerConfigurationRequirements() {
        return this.canControllerConfigurationRequirements;
    }

    public void setCanControllerConfigurationRequirements(CanControllerConfigurationRequirements value) {
        this.canControllerConfigurationRequirements = value;
    }
    
    
}