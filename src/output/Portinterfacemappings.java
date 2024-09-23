package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Portinterfacemappings {

    
    
    protected ArrayList<ClientServerInterfaceMapping> clientServerInterfaceMappings;
    
    
    
    protected ArrayList<ModeInterfaceMapping> modeInterfaceMappings;
    
    
    
    protected ArrayList<TriggerInterfaceMapping> triggerInterfaceMappings;
    
    
    
    protected ArrayList<VariableAndParameterInterfaceMapping> variableAndParameterInterfaceMappings;
    
    

    
    
    @XmlElement(name="CLIENT-SERVER-INTERFACE-MAPPING")
    public ArrayList<ClientServerInterfaceMapping> getClientServerInterfaceMappings() {
        return this.clientServerInterfaceMappings;
    }

    public void setClientServerInterfaceMappings(ArrayList<ClientServerInterfaceMapping> value) {
        this.clientServerInterfaceMappings = value;
    }
    
    
    
    @XmlElement(name="MODE-INTERFACE-MAPPING")
    public ArrayList<ModeInterfaceMapping> getModeInterfaceMappings() {
        return this.modeInterfaceMappings;
    }

    public void setModeInterfaceMappings(ArrayList<ModeInterfaceMapping> value) {
        this.modeInterfaceMappings = value;
    }
    
    
    
    @XmlElement(name="TRIGGER-INTERFACE-MAPPING")
    public ArrayList<TriggerInterfaceMapping> getTriggerInterfaceMappings() {
        return this.triggerInterfaceMappings;
    }

    public void setTriggerInterfaceMappings(ArrayList<TriggerInterfaceMapping> value) {
        this.triggerInterfaceMappings = value;
    }
    
    
    
    @XmlElement(name="VARIABLE-AND-PARAMETER-INTERFACE-MAPPING")
    public ArrayList<VariableAndParameterInterfaceMapping> getVariableAndParameterInterfaceMappings() {
        return this.variableAndParameterInterfaceMappings;
    }

    public void setVariableAndParameterInterfaceMappings(ArrayList<VariableAndParameterInterfaceMapping> value) {
        this.variableAndParameterInterfaceMappings = value;
    }
    
    
}