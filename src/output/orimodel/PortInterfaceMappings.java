package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PortInterfaceMappings {

    
    
    protected ArrayList<ClientServerInterfaceMapping> clientServerInterfaceMapping;
    
    
    
    protected ArrayList<ModeInterfaceMapping> modeInterfaceMapping;
    
    
    
    protected ArrayList<TriggerInterfaceMapping> triggerInterfaceMapping;
    
    
    
    protected ArrayList<VariableAndParameterInterfaceMapping> variableAndParameterInterfaceMapping;
    
    

    
    
    @XmlElement(name="CLIENT-SERVER-INTERFACE-MAPPING")
    public ArrayList<ClientServerInterfaceMapping> getClientServerInterfaceMapping() {
    return this.clientServerInterfaceMapping;
}

    public void setClientServerInterfaceMapping(ArrayList<ClientServerInterfaceMapping> value) {
        this.clientServerInterfaceMapping = value;
    }
    
    
    
    @XmlElement(name="MODE-INTERFACE-MAPPING")
    public ArrayList<ModeInterfaceMapping> getModeInterfaceMapping() {
    return this.modeInterfaceMapping;
}

    public void setModeInterfaceMapping(ArrayList<ModeInterfaceMapping> value) {
        this.modeInterfaceMapping = value;
    }
    
    
    
    @XmlElement(name="TRIGGER-INTERFACE-MAPPING")
    public ArrayList<TriggerInterfaceMapping> getTriggerInterfaceMapping() {
    return this.triggerInterfaceMapping;
}

    public void setTriggerInterfaceMapping(ArrayList<TriggerInterfaceMapping> value) {
        this.triggerInterfaceMapping = value;
    }
    
    
    
    @XmlElement(name="VARIABLE-AND-PARAMETER-INTERFACE-MAPPING")
    public ArrayList<VariableAndParameterInterfaceMapping> getVariableAndParameterInterfaceMapping() {
    return this.variableAndParameterInterfaceMapping;
}

    public void setVariableAndParameterInterfaceMapping(ArrayList<VariableAndParameterInterfaceMapping> value) {
        this.variableAndParameterInterfaceMapping = value;
    }
    
    
}